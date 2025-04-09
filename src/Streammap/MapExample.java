package Streammap;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = List.of("shiva", "amit", "basu");

        //List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowerCaseNames=names.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCaseNames);
    }
}
