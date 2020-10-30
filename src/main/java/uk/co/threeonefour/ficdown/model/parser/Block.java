package uk.co.threeonefour.ficdown.model.parser;

import java.util.List;

public class Block {

    private final BlockType type;
    private final String name;
    private final List<Line> lines;
    private final int lineNumber;

    public Block(BlockType type, String name, List<Line> lines, int lineNumber) {
        this.type = type;
        this.name = name;
        this.lines = lines;
        this.lineNumber = lineNumber;
    }

    public BlockType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public List<Line> getLines() {
        return lines;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String toString() {
        return "Block{" +
                "type=" + type +
                ", name=" + name +
                ", lines=" + lines +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
