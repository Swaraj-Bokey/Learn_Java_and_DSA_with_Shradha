package function_practice_questions;
//print ibonacci series till n terms
import java.util.*;
public class q10 
{
    public static int fibnacciTillNterms(int n)
    {
        int a = 0, b = 1;
        for(int i = 1; i <= n-1; i++)
        {
            
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
            
        }
        return a;
    }

    public static void  main(String[] args)
    {
        System.out.println("Enter term number n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibnacciTillNterms(n));
        sc.close();

    }
    
}
