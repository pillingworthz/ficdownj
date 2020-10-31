package uk.co.threeonefour.ficdown.model.story;

import java.util.HashMap;
import java.util.Map;

public class Action {

    private final int id;
    private final String toggle;
    private final String rawDescription;
    private final String description;
    private final int lineNumber;
    private final boolean visited;

    public Action(Action.Builder b) {
        this.id = b.id;
        this.toggle = b.toggle;
        this.rawDescription = b.rawDescription;
        this.description = b.description;
        this.lineNumber = b.lineNumber;
        this.visited = b.visited;
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

    public static Action.Builder builder(Story.Builder storyBuilder) {
        return new Action.Builder(storyBuilder);
    }

    public static class Builder {

        private  int id;
        private  String toggle;
        private  String rawDescription;
        private  String description;
        private  int lineNumber;
        private  boolean visited;

        private Story.Builder storyBuilder;

        private Builder(Story.Builder storyBuilder) {
            this.storyBuilder = storyBuilder;
        }

        public Action.Builder id(int id) {
            this.id = id;
            return this;
        }

        public Action.Builder toggle(String toggle) {
            this.toggle = toggle;
            return this;
        }

        public Action.Builder description(String description) {
            this.description = description;
            return this;
        }

        public Action.Builder rawDescription(String rawDescription) {
            this.rawDescription = rawDescription;
            return this;
        }

        public Action.Builder lineNumber(int lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }

        public Action.Builder visited(boolean visited) {
            this.visited = visited;
            return this;
        }

        public Story.Builder end() {
            storyBuilder.action(build()).clearAction();
            return storyBuilder;
        }

        public Action build() {
            return new Action(this);
        }

    }


}
