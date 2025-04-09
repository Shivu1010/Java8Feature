package lamdaprogramstring;

public class UpperCase {
    public static void main(String[] args) {
        StringFunction upperCase = (s) -> s.toUpperCase();
        printFormatted("Hello world", upperCase);
    }

    public static void printFormatted(String str, StringFunction format) {
        System.out.println(format.run(str));
    }

    @FunctionalInterface
    interface StringFunction {
        String run(String str);
    }
}
