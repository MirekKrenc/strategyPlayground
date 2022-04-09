package strategy.status;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatusPartiallyFilled extends Status{
    @Override
    public List<String> setListOfPatternStatuses() {
        return List.of("CKIN", "USED");
    }

    @Override
    public String setOutputStatus() {
        return "PARTIALLY_FILLED";
    }

    @Override
    public Predicate<List<String>> setConditionTest() {
        return l -> {
            return l.stream().distinct().collect(Collectors.toList())
                    .size() == 2 && l.containsAll(this.getListOfPatternStatuses());

        };
    }
}

