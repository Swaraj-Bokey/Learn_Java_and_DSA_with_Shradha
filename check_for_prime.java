//incompleate
import java.util.*;

public class check_for_prime 
{
    
    public static void prime(int n)
    {
        if(n>1)
        {
            for(int i = n-1; i >= 2; i--)    
            {
            
                if(n % i != 0 && i == 2)
                {
                    System.out.println(n + " is a prime number");
                    return;   
                }

                if(n % i == 0) 
                {
                    System.out.println(n + " is not a prime number");
                    return;
                }
            }
        }
        else
        {
            System.out.println("enter number greater than nn");
            return;
        }

         
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n to check its prime property");
        int n = sc.nextInt();
        prime(n);
        sc.close();
        
        
    }
}
