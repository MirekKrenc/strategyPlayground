package strategy.status;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StatusExtractor implements SingeDataExtractor<List<String>> {
    static List<Status> patternStatuses = new ArrayList<>();

    static {
        patternStatuses.add(new StatusOK());
        patternStatuses.add(new StatusPartiallyFilled());
        patternStatuses.add(new StatusUsed());
    }

    @Override
    public String extract(List<String> PNRStatusList) {
        return patternStatuses.stream()
                .filter(status -> status.getConditionTest().test(PNRStatusList))
                .findFirst()
                .map(status -> status.getOutputStatus())
                .orElse("N/A -> " + PNRStatusList.stream().collect(Collectors.joining(",")));
    }
}
