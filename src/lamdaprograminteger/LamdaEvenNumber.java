package lamdaprograminteger;

import java.util.ArrayList;

public class LamdaEvenNumber {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            numbers.add(i);
        }
        numbers.forEach((n)->{if(n%2==0)System.out.println(n);});
    }
}
