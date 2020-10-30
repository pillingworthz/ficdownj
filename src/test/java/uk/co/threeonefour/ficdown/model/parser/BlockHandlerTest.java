package uk.co.threeonefour.ficdown.model.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import uk.co.threeonefour.ficdown.model.story.Story;
import uk.co.threeonefour.ficdown.parser.FlexmarkBlockHandler;

public class BlockHandlerTest {

    private FlexmarkBlockHandler blockHandler;

    @Before
    public void before() {
        blockHandler = new FlexmarkBlockHandler();
    }

//    @Test
//    public void noStoryBlockThrowsException() {
//        String text = "##this file has no story\n"
//                + "just a lonely scene";
//        blockHandler.extractBlocks(text);
//    }
//
//    @Test
//    public void storyWithNoAnchorThrowsException() {
//        String text = "#my story\n"
//                + "doesn't link to a scene\n"
//                + "##a scene\n"
//                + "nothing links here";
//        blockHandler.extractBlocks(text);
//    }
//
//    @Test
//    public void storiesWithFancyAnchorsThrowExceptions() {
//        String text = "# [my story]( / a - scene ? conditional)\n"
//                + "story with a conditional\n"
//                + "##a scene\n"
//                + "this is a scene";
//        blockHandler.extractBlocks(text);
//
//        text = "# [my story]( / a - scene#toggle)\n"
//                + "story with a toggle\n"
//                + "##a scene\n"
//                + "this is a scene";
//        blockHandler.extractBlocks(text);
//
//        text = "# [my story]( / a - scene#?conditional#toggle)\n"
//                + "story with a conditional and a toggle\n"
//                + "##a scene\n"
//                + "this is a scene";
//        blockHandler.extractBlocks(text);
//    }
//
//    @Test
//    public void storyLinkingToNonExistentSceneThrowsException() {
//        String text = "# [a story]( / non - existent)\n"
//                + "this story links to a first scene that doesn't exist\n"
//                + "##a scene\n"
//                + "this scene is so cold and lonely";
//        blockHandler.extractBlocks(text);
//    }
//
//    @Test
//    public void StoryWithALegitAnchorParses() {
//        String text = "# [my story]( / a - scene)"
//                + "story with a simple link"
//                + "##a scene"
//                + "this is a scene";
//        blockHandler.extractBlocks(text);
//    }
//
//    @Test
//    public void StoryWithDuplicateActionsThrowsException() {
//        String text = "# [a story]( / a - scene)\n"
//                + "this story is action - happy\n"
//                + "##a scene\n"
//                + "this is the first scene\n"
//                + "###an action\n"
//                + "this is an action\n"
//                + "##another scene\n"
//                + "this is another scene\n"
//                + "###an action\n"
//                + "oops, this is the same action!";
//        blockHandler.extractBlocks(text);
//    }

    @Test
    public void StoryWithScenesAndActionsParses() {
        String text = "# [my story](/a-scene)\n"
                + "story with a simple link\n"
                + "## a scene\n"
                + "this is a scene\n"
                + "## [a scene](?something)\n"
                + "this is the same scene with a conditional\n"
                + "## another scene\n"
                + "this is another scene\n"
                + "### action1\n"
                + "this is an action\n"
                + "### action 2\n"
                + "this is another action\n"
                + "## yet another scene\n"
                + "yup here 's some more\n"
                + "### another action\n"
                + "the last action(hero?)";
        Iterable<Block> blocks = blockHandler.extractBlocks(text);
        Story story = blockHandler.parseBlocks(blocks);

        Assert.assertEquals(3, story.getScenes().size());
        Assert.assertEquals(2, story.getScenes().get("a-scene").size());
        Assert.assertEquals(3, story.getActions().size());
    }
}
