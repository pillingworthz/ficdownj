package uk.co.threeonefour.ficdown.model.story;

import java.util.*;

public class Story {

    private final String name;
    private final String description;
    private final String firstScene;
    private final Map<String, List<Scene>> scenes;
    private final Map<Integer, Action> actions;

    public Story(Builder b) {
        this.name = b.name;
        this.description = b.description;
        this.firstScene = b.firstScene;
        /* TODO (pillingworth, 2020-10-30) the scenes value List is not immutable */
        this.scenes = Collections.unmodifiableMap(new HashMap<>(b.scenes));
        this.actions = Collections.unmodifiableMap(new HashMap<>(b.actions));;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstScene() {
        return firstScene;
    }

    public Map<String, List<Scene>> getScenes() {
        return scenes;
    }

    public Map<Integer, Action> getActions() {
        return actions;
    }

    @Override
    public String toString() {
        return "Story{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", firstScene='" + firstScene + '\'' +
                ", scenes=" + scenes +
                ", actions=" + actions +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String firstScene;
        private Map<String, List<Scene>> scenes = new HashMap<>();
        private Map<Integer, Action> actions = new HashMap<>();

        private Scene.Builder sceneBuilder;
        private Action.Builder actionBuilder;

        private Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder firstScene(String firstScene) {
            this.firstScene = firstScene;
            return this;
        }

        public Builder scene(Scene scene) {
            scenes.computeIfAbsent(scene.getKey(), k -> new ArrayList<Scene>()).add(scene);
            return this;
        }

        public Scene.Builder withScene() {
            if (sceneBuilder == null) {
                sceneBuilder = Scene.builder(this);
            }
            return sceneBuilder;
        }

        public Builder clearScene() {
            sceneBuilder = null;
            return this;
        }

        public Builder action(Action action) {
            actions.put(action.getId(), action);
            return this;
        }

        public Action.Builder withAction() {
            if (actionBuilder == null) {
                actionBuilder = Action.builder(this);
            }
            return actionBuilder;
        }

        public Builder clearAction() {
            actionBuilder = null;
            return this;
        }

        public Story build() {
            return new Story(this);
        }

    }
}
