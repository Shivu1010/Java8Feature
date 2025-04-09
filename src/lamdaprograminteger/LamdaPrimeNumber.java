package lamdaprograminteger;

import java.util.ArrayList;

public class LamdaPrimeNumber {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=2;i<=10;i++)
        {
            numbers.add(i);
        }
        numbers.forEach((n)->{if(isPrime(n))System.out.println(n);});

    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
