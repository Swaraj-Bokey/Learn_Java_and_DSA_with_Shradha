//phase 2
import java.util.*;

public class check_for_prime_phase2 
{
    
    public static String prime(int n)
    {
        if(n>1)
        {
            for(int i = n-1; i >= 2; i--)    
            {
            
                if(n % i != 0 && i == 2)
                {
                    
                    return "yes";   
                }

                if(n % i == 0) 
                {
                    
                    return "no";
                }
            }
        }
        
        return "enter valid n";
         
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n to check its prime property");
        int n = sc.nextInt();
        
        System.out.println(prime(n));
        sc.close();
        
        
    }
}