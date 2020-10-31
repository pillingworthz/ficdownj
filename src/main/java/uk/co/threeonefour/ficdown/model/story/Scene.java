package uk.co.threeonefour.ficdown.model.story;

import java.util.HashMap;
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

    public Scene(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.key = b.key;
        this.description = b.description;
        this.rawDescription = b.rawDescription;
        this.conditions = new HashMap<>(b.conditions);
        this.lineNumber = b.lineNumber;
        this.visited = b.visited;
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

    public static Scene.Builder builder(Story.Builder storyBuilder) {
        return new Scene.Builder(storyBuilder);
    }

    public static class Builder {

        private int id;
        private String name;
        private String key;
        private String description;
        private String rawDescription;
        private Map<String, Boolean> conditions = new HashMap<>();
        private int lineNumber;
        private boolean visited;

        private Story.Builder storyBuilder;

        private Builder(Story.Builder storyBuilder) {
            this.storyBuilder = storyBuilder;
        }

        public Scene.Builder id(int id) {
            this.id = id;
            return this;
        }

        public Scene.Builder name(String name) {
            this.name = name;
            return this;
        }

        public Scene.Builder key(String key) {
            this.key = key;
            return this;
        }

        public Scene.Builder description(String description) {
            this.description = description;
            return this;
        }

        public Scene.Builder rawDescription(String rawDescription) {
            this.rawDescription = rawDescription;
            return this;
        }

        public Scene.Builder condition(String key, Boolean condition) {
            conditions.put(key, condition);
            return this;
        }

        public Scene.Builder lineNumber(int lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }

        public Scene.Builder visited(boolean visited) {
            this.visited = visited;
            return this;
        }

        public Story.Builder end() {
            storyBuilder.scene(build()).clearScene();
            return storyBuilder;
        }

        public Scene build() {
            return new Scene(this);
        }

    }

}
