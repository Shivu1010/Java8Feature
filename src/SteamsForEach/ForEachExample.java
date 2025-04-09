package SteamsForEach;

import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = List.of("Shiva", "Amit", "Neha");

        names.stream().forEach(name -> System.out.println("Name: " + name));
    }
}
