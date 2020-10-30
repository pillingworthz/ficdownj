package uk.co.threeonefour.ficdown.parser;

import uk.co.threeonefour.ficdown.model.parser.Block;
import uk.co.threeonefour.ficdown.model.story.Story;

public interface BlockHandler {

    Iterable<Block> extractBlocks(String text);

    Story parseBlocks(Iterable<Block> blocks);
}
