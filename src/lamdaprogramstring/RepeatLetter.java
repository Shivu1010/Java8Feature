package lamdaprogramstring;

public class RepeatLetter {
    public static void main(String[] args)
    {
        StringFunction repeatLetter= (s)-> s.repeat(3);
        printFormatted("Hi",repeatLetter);
    }
    public static void printFormatted(String str, StringFunction format) {
        System.out.println(format.run(str));
    }
    @FunctionalInterface
    interface StringFunction{
        String run(String s);
    }

}
