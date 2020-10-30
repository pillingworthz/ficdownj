package uk.co.threeonefour.ficdown.model.story.extensions;

import uk.co.threeonefour.ficdown.model.story.Scene;

import java.util.HashMap;

public class SceneExtensions {

    public static Scene clone(Scene scene) {
        return new Scene(
                0, scene.getName(), "", scene.getDescription(), "", scene.getConditions() == null ? null : new HashMap<>(), 0, false);
    }
}
