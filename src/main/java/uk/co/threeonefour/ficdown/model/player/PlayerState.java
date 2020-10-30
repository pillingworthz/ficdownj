package uk.co.threeonefour.ficdown.model.player;

import java.util.HashMap;
import java.util.Map;

public class PlayerState extends HashMap<String, Boolean> {

    public PlayerState(Map<String, Boolean> copyFrom) {
        putAll(copyFrom);
    }

    public PlayerState clone() {
        return new PlayerState(this);
    }

    public void visitedScene(String sceneId) {
        String key = String.format(">{0}", sceneId);
        if (!containsKey(key)) {
            put(key, true);
        }
    }
}
