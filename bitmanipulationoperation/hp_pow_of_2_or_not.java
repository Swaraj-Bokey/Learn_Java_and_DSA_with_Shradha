package bitmanipulationoperation;
// identify given nber is power of 2
import java.util.*;
public class hp_pow_of_2_or_not
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check its required property");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0)
        {
            count = count + (n & 1);
            n = n >> 1;
        }
        if(count > 1)
        {
            System.out.println("number is not power of 2 ");
        }
        else
        {
            System.out.print("number is power of 2");
        }
        sc.close();
        
    }
}