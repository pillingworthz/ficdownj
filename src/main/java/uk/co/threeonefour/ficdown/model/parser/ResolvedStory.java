package uk.co.threeonefour.ficdown.model.parser;

public class ResolvedStory {

    private final String name;
    private final String description;
    private final String firstPage;
    private final Iterable<ResolvedPage> pages;
    private final Iterable<Orphan> orphans;

    public ResolvedStory(String name, String description, String firstPage, Iterable<ResolvedPage> pages, Iterable<Orphan> orphans) {
        this.name = name;
        this.description = description;
        this.firstPage = firstPage;
        this.pages = pages;
        this.orphans = orphans;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstPage() {
        return firstPage;
    }

    public Iterable<ResolvedPage> getPages() {
        return pages;
    }

    public Iterable<Orphan> getOrphans() {
        return orphans;
    }

    @Override
    public String toString() {
        return "ResolvedStory{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", firstPage='" + firstPage + '\'' +
                ", pages=" + pages +
                ", orphans=" + orphans +
                '}';
    }
}
