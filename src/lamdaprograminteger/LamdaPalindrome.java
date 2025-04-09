package lamdaprograminteger;

import java.util.ArrayList;

public class LamdaPalindrome {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers =new ArrayList<>();
        for (int i = 10; i <= 200; i++) {
            numbers.add(i);
        }
        numbers.forEach((n)->{if(isPalindrome(n))System.out.println(n);});
    }
    public static boolean isPalindrome(int n)
    {
        int reverse=0;
        int temp=n;
        while(temp!=0)
        {
            reverse=reverse*10+temp%10;
            temp/=10;
        }
        return reverse==n;
    }
}
