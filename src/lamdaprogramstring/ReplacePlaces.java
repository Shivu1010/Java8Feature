package lamdaprogramstring;

public class ReplacePlaces {
    public static void main(String[] args)
    {
        StringFunction replaceSpaces = (s) -> s.replace(" ", "_");
        printFormatted("Hello World", replaceSpaces);

    }
    public static void printFormatted(String str, StringFunction format) {
        System.out.println(format.run(str));}

    @FunctionalInterface
    interface StringFunction{
        String run(String s);
    }

}
