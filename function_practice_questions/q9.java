package function_practice_questions;
import java.util.*;

public class q9 
{
    public static int gcdof2numbers(int n, int m)
    {
        if(n > m)
        {
            int s = m, l = n;
            for(int i = s; i >= 1; i--)
            {
                if(l % s == 0) 
                {
                    return 10;  // Tracing: exact divide
                }
                else if((s % i == 0) && (l % i == 0) && (i > 1) && (s != i))
                {
                    return 20;  // Tracing: both divisible, i > 1
                }
                else if((s % i == 0) && (l % i == 0) && (s != i))
                {
                    return 30;  // Tracing: both divisible
                }
            }
        }
        else if(m > n)
        {
            int s = n, l = m;
            for(int i = s; i >= 1; i--)
            {
                if(l % s == 0) 
                {
                    return 40;  // Tracing: exact divide
                }
                else if((s % i == 0) && (l % i == 0) && (i > 1) && (s != i))
                {
                    return 50;  // Tracing: both divisible, i > 1
                }
                else if((s % i == 0) && (l % i == 0) && (s != i))
                {
                    return 60;  // Tracing: both divisible
                }
            }
        }
        else
        {
            return 70;  // Tracing: n == m
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter 2 numbers for their gcd");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("gcd of function is " + gcdof2numbers(n, m));
        sc.close();
    }
}
