package uk.co.threeonefour.ficdown.model.player;

import uk.co.threeonefour.ficdown.model.story.Scene;

import java.util.Map;
import java.util.UUID;

public class PageState {

    private final UUID id;
    private final Scene scene;
    private final State state;
    private final State affectedState;
    private final Map<String, Integer> stateMatrix;
    private final Map<String, String> links;

    private String _uniqueHash;
    private String _compressedHash;

    public PageState(UUID id, Scene scene, State state, State affectedState, Map<String, Integer> stateMatrix, Map<String, String> links) {
        this.id = id;
        this.scene = scene;
        this.state = state;
        this.affectedState = affectedState;
        this.stateMatrix = stateMatrix;
        this.links = links;
    }

    public UUID getId() {
        return id;
    }

    public Scene getScene() {
        return scene;
    }

    public State getState() {
        return state;
    }

    public State getAffectedState() {
        return affectedState;
    }

    public Map<String, Integer> getStateMatrix() {
        return stateMatrix;
    }

    public Map<String, String> getLinks() {
        return links;
    }

    private String uniqueHash() {
        return _uniqueHash != null ? _uniqueHash : (_uniqueHash = "");
    }

    private String compressedHash() {
        return _compressedHash != null ? _compressedHash : (_compressedHash = "");
    }

    @Override
    public String toString() {
        return "PageState{" +
                "id=" + id +
                ", scene=" + scene +
                ", state=" + state +
                ", affectedState=" + affectedState +
                ", stateMatrix=" + stateMatrix +
                ", links=" + links +
                ", _uniqueHash='" + _uniqueHash + '\'' +
                ", _compressedHash='" + _compressedHash + '\'' +
                '}';
    }
}
