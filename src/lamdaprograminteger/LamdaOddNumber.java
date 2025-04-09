package lamdaprograminteger;

import java.util.ArrayList;

public class LamdaOddNumber {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int num:numbers)
        {
            numbers.add(num);
        }
        numbers.forEach((n)->{if(n%2!=0)System.out.println(n);});
    }
}
