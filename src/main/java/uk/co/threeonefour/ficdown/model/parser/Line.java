package uk.co.threeonefour.ficdown.model.parser;

public class Line {

    private final int number;
    private final String text;

    public Line(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Line{" +
                "number=" + number +
                ", text='" + text + '\'' +
                '}';
    }
}
