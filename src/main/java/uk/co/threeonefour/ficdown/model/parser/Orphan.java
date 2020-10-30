package uk.co.threeonefour.ficdown.model.parser;

public class Orphan {

    private final String type;
    private final String name;
    private final int lineNumber;

    public Orphan(String type, String name, int lineNumber) {
        this.type = type;
        this.name = name;
        this.lineNumber = lineNumber;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    @Override
    public String toString() {
        return "Orphan{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", lineNumber=" + lineNumber +
                '}';
    }
}
