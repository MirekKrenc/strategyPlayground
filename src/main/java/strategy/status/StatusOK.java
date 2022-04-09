package strategy.status;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatusOK extends Status {
    @Override
    public List<String> setListOfPatternStatuses() {
        return List.of("OK");
    }

    @Override
    public String setOutputStatus() {
        return "OK";
    }

    @Override
    public Predicate<List<String>> setConditionTest() {
        return l -> {
            return l.stream().distinct().collect(Collectors.toList()).size() == 1 &&
                    l.containsAll(this.getListOfPatternStatuses());

        };
    }
}

