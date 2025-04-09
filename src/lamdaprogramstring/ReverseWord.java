package lamdaprogramstring;

public class ReverseWord {
    public static void main(String[] args)
    {
     StringFunction reverseWord= (s)->new StringBuilder(s).reverse().toString();
     main("Hello world",reverseWord);
    }
    public static void main(String str,StringFunction formate)
    {
        System.out.println(formate.run(str));
    }
    @FunctionalInterface
    interface StringFunction{
        String run(String s);
    }
}
