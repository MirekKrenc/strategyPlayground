package strategy.status;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StatusUsed extends Status{
    @Override
    public List<String> setListOfPatternStatuses() {
        return List.of("USED");
    }

    @Override
    public String setOutputStatus() {
        return "USED";
    }

    @Override
    public Predicate<List<String>> setConditionTest() {
        return l -> {
            return l.stream().distinct().collect(Collectors.toList())
                    .containsAll(this.getListOfPatternStatuses());
        };
    }
}
