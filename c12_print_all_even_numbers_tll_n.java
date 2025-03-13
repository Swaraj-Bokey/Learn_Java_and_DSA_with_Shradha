// print all even numbers till n
import java.util.*;
public class c12_print_all_even_numbers_tll_n 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n as the limit of even numbers to be printed");

        int n = sc.nextInt();

        for(int i=0; i<=n; i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }    
        }
        sc.close();
    }
}
