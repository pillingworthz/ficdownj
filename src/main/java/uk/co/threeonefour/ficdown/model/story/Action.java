package uk.co.threeonefour.ficdown.model.story;

public class Action {

    private final int id;
    private final String toggle;
    private final String rawDescription;
    private final String description;
    private final int lineNumber;
    private final boolean visited;

    public Action(int id, String toggle, String rawDescription, String description, int lineNumber, boolean visited) {
        this.id = id;
        this.toggle = toggle;
        this.rawDescription = rawDescription;
        this.description = description;
        this.lineNumber = lineNumber;
        this.visited = visited;
    }

    public int getId() {
        return id;
    }

    public String getToggle() {
        return toggle;
    }

    public String getRawDescription() {
        return rawDescription;
    }

    public String getDescription() {
        return description;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public boolean isVisited() {
        return visited;
    }

    @Override
    public String toString() {
        return "Action{" +
                "id=" + id +
                ", toggle='" + toggle + '\'' +
                ", rawDescription='" + rawDescription + '\'' +
                ", description='" + description + '\'' +
                ", lineNumber=" + lineNumber +
                ", visited=" + visited +
                '}';
    }
}
