package uk.co.threeonefour.ficdown.model.parser;

public class ResolvedPage {

    private final String name;
    private final String content;
    private final Iterable<String> activeToggles;

    public ResolvedPage(String name, String content, Iterable<String> activeToggles) {
        this.name = name;
        this.content = content;
        this.activeToggles = activeToggles;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Iterable<String> getActiveToggles() {
        return activeToggles;
    }

    @Override
    public String toString() {
        return "ResolvedPage{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", activeToggles=" + activeToggles +
                '}';
    }
}
