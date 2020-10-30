package uk.co.threeonefour.ficdown.model.parser;

import java.util.Map;

public class Href {

    public final String original;
    public final String target;
    public final Map<String, Boolean> conditions;
    public final Iterable<String> toggles;

    public Href(String original, String target, Map<String, Boolean> conditions, Iterable<String> toggles) {
        this.original = original;
        this.target = target;
        this.conditions = conditions;
        this.toggles = toggles;
    }

    public String getOriginal() {
        return original;
    }

    public String getTarget() {
        return target;
    }

    public Map<String, Boolean> getConditions() {
        return conditions;
    }

    public Iterable<String> getToggles() {
        return toggles;
    }

    @Override
    public String toString() {
        return "Href{" +
                "original='" + original + '\'' +
                ", target='" + target + '\'' +
                ", conditions=" + conditions +
                ", toggles=" + toggles +
                '}';
    }
}
