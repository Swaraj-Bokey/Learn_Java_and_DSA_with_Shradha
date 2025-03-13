// print sum of first n natural numbers

import java.util.*;

public class c10_print_sum_of_first_n_natural_numbers 
{
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number n till which sum is to be calculated");
        int n =sc.nextInt(), sum = 0;
        
        for(int i=1; i<=n; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
