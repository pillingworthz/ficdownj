package uk.co.threeonefour.ficdown.model.parser;

public class Anchor {

    private final String original;
    private final String text;
    private final String href;
    private final String title;
    private final int lineNumber;
    private final int colNumber;

    public Anchor(String original, String text, String href, String title, int lineNumber, int colNumber) {
        this.original = original;
        this.text = text;
        this.href = href;
        this.title = title;
        this.lineNumber = lineNumber;
        this.colNumber = colNumber;
    }

    public String getOriginal() {
        return original;
    }

    public String getText() {
        return text;
    }

    public String getHref() {
        return href;
    }

    public String getTitle() {
        return title;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public int getColNumber() {
        return colNumber;
    }

    @Override
    public String toString() {
        return "Anchor{" +
                "original='" + original + '\'' +
                ", text='" + text + '\'' +
                ", href='" + href + '\'' +
                ", title='" + title + '\'' +
                ", lineNumber=" + lineNumber +
                ", colNumber=" + colNumber +
                '}';
    }
}
