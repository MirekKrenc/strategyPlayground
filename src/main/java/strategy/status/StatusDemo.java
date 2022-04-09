package strategy.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatusDemo {
    public static void main(String[] args) {
        List<String> originalPnrStatuses = Arrays.asList("OK");

        StatusExtractor statusExtractor = new StatusExtractor();
        String outputStatus = statusExtractor.extract(originalPnrStatuses);

        System.out.println(outputStatus);
    }
}
