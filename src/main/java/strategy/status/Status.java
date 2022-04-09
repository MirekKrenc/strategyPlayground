package strategy.status;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public abstract class Status {

    private final List<String> listOfPatternStatuses;
    private final String outputStatus;
    private final Predicate<List<String>> conditionTest;

    protected Status() {
        listOfPatternStatuses = setListOfPatternStatuses();
        outputStatus = setOutputStatus();
        conditionTest = setConditionTest();
    }

    public abstract List<String> setListOfPatternStatuses();
    public abstract String setOutputStatus();
    public abstract Predicate<List<String>> setConditionTest();

    public List<String> getListOfPatternStatuses() {
        return listOfPatternStatuses;
    }

    public String getOutputStatus() {
        return outputStatus;
    }

    public Predicate<List<String>> getConditionTest() {
        return conditionTest;
    }

}

