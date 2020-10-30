package uk.co.threeonefour.ficdown.model.player;

import java.util.BitSet;

public class State {

    private final BitSet playerState;
    private final BitSet scenesSeen;
    private final BitSet actionsToShow;
    private final BitSet actionFirstToggles;

    public State(BitSet playerState, BitSet scenesSeen, BitSet actionsToShow, BitSet actionFirstToggles) {
        this.playerState = playerState;
        this.scenesSeen = scenesSeen;
        this.actionsToShow = actionsToShow;
        this.actionFirstToggles = actionFirstToggles;
    }

    public BitSet getPlayerState() {
        return playerState;
    }

    public BitSet getScenesSeen() {
        return scenesSeen;
    }

    public BitSet getActionsToShow() {
        return actionsToShow;
    }

    public BitSet getActionFirstToggles() {
        return actionFirstToggles;
    }

    @Override
    public String toString() {
        return "State{" +
                "PlayerState=" + playerState +
                ", ScenesSeen=" + scenesSeen +
                ", ActionsToShow=" + actionsToShow +
                ", ActionFirstToggles=" + actionFirstToggles +
                '}';
    }
}
