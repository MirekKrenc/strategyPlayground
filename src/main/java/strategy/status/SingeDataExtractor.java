package strategy.status;

import java.util.List;

public interface SingeDataExtractor<T> {
    String extract(List<T> source);
}
