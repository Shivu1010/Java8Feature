package Streamflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E", "F")
        );

        List<String> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(flatList);
    }
}
