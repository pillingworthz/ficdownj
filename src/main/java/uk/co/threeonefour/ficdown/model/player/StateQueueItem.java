package uk.co.threeonefour.ficdown.model.player;

import java.util.List;

public class StateQueueItem {

    private final PageState page;
    private final List<State> affectedStates;

    public StateQueueItem(PageState page, List<State> affectedStates) {
        this.page = page;
        this.affectedStates = affectedStates;
    }

    public PageState getPage() {
        return page;
    }

    public List<State> getAffectedStates() {
        return affectedStates;
    }

    @Override
    public String toString() {
        return "StateQueueItem{" +
                "page=" + page +
                ", affectedStates=" + affectedStates +
                '}';
    }
}
