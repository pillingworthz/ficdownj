package uk.co.threeonefour.ficdown.model.story;

import java.util.Map;

public class Scene {

    private final int id;
    private final String name;
    private final String key;
    private final String description;
    private final String rawDescription;
    private final Map<String, Boolean> conditions;
    private final int lineNumber;
    private final boolean visited;

    public Scene(int id, String name, String key, String description, String rawDescription, Map<String, Boolean> conditions, int lineNumber, boolean visited) {
        this.id = id;
        this.name = name;
        this.key = key;
        this.description = description;
        this.rawDescription = rawDescription;
        this.conditions = conditions;
        this.lineNumber = lineNumber;
        this.visited = visited;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public String getRawDescription() {
        return rawDescription;
    }

    public Map<String, Boolean> getConditions() {
        return conditions;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public boolean isVisited() {
        return visited;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", key='" + key + '\'' +
                ", description='" + description + '\'' +
                ", rawDescription='" + rawDescription + '\'' +
                ", conditions=" + conditions +
                ", lineNumber=" + lineNumber +
                ", visited=" + visited +
                '}';
    }
}
