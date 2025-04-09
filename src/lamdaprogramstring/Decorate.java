package lamdaprogramstring;

public class Decorate {
    public static void main(String[] args)
    {
     StringFunction decorate= (s)-> "*"+"o"+"#3" ;
     printFormatted(("Hello world"),decorate);
    }
    public static void printFormatted(String str,StringFunction formate)
    {
        System.out.println(formate.run(str));
    }
    @FunctionalInterface
    interface StringFunction{
        String run(String s);
    }
}
