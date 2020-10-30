package uk.co.threeonefour.ficdown.model.parser;

public class FicDownException extends Exception {

    private final String blockName;
    private final Integer lineNumber;
    private final Integer colNumber;

    public FicDownException(String blockName, String message, Integer lineNumber, Integer colNumber) {
        super(message);
        this.blockName = blockName;
        this.lineNumber = lineNumber;
        this.colNumber = colNumber;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public Integer getColNumber() {
        return colNumber;
    }

    public String getBlockName() {
        return blockName;
    }

    @Override
    public String toString() {
        return "FicDownException{" +
                "blockName='" + blockName + '\'' +
                ", lineNumber=" + lineNumber +
                ", colNumber=" + colNumber +
                '}';
    }
}
