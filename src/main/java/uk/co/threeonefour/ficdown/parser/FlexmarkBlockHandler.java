package uk.co.threeonefour.ficdown.parser;

import com.vladsch.flexmark.ast.Heading;
import com.vladsch.flexmark.ast.LinkNodeBase;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.ast.Document;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.data.MutableDataSet;
import uk.co.threeonefour.ficdown.model.parser.Block;
import uk.co.threeonefour.ficdown.model.parser.FicDownException;
import uk.co.threeonefour.ficdown.model.story.Story;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FlexmarkBlockHandler implements BlockHandler {

    private List<FicDownException> warnings;

    @Override
    public Iterable<Block> extractBlocks(String text) {

        Story.Builder storyBuilder = Story.builder();


        MutableDataSet options = new MutableDataSet();

        // set optional extensions
        //options.set(Parser.EXTENSIONS, Arrays.asList(TablesExtension.create(), StrikethroughExtension.create()));

        // use to convert soft-breaks to hard breaks
        //options.set(HtmlRenderer.SOFT_BREAK, "<br />\n");

        Parser parser = Parser.builder(options).build();
        Document document = parser.parse(text);
        traverse(document, (node) -> {

            System.out.println(node);

            if (node instanceof Heading) {
                Heading heading = (Heading) node;
                int level = heading.getLevel();
                String name = heading.getAnchorRefText();
                String url = null;

                LinkNodeBase link = (LinkNodeBase) node.getChildOfType(LinkNodeBase.class);
                if (link != null && link.getUrl() != null) {
                    url = link.getUrl().toStringOrNull();
                }

                System.out.println("Heading(level: " + level + ", name: " + name + ", url: " + url);

                if (level == 1) {
                    storyBuilder.name(name);
                } else if (level == 2) {

                } else if (level == 3) {

                } else {
                    /* TODO (pillingworth, 20202-10-30) an unsupported level */
                }

                return false;
            }

            System.out.println();

            return true;
        });




        List<Block> blocks = new ArrayList<>();
        return blocks;
    }

    public void traverse(Node node, Function<Node, Boolean> consumer) {
        Boolean recurseChildren = consumer.apply(node);
        if (recurseChildren) {
            for (Iterator<Node> it = node.getChildIterator(); it.hasNext(); ) {
                Node child = it.next();
                traverse(child, consumer);
            }
        }
    }

    @Override
    public Story parseBlocks(Iterable<Block> blocks) {
        return null;
    }
}
