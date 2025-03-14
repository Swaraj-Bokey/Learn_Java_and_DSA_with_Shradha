/* Print if a number is prime or not */

import java.util.*;

public class c15_number_is_prime_or_not 
{
    public static void main(String[] args)    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check its Prime property");
        int n = sc.nextInt();
        
        int i = n-1;
        while(i >= 2)
        {
            if(n % i != 0 && i == 2)
            {
                System.out.println(n + " is a prime number");
                break;
            }

            if(n % i == 0)
            {
                System.out.println(n + " is not a prime number");
                break;
            }
            i--;
        }
        sc.close();
    }
}
