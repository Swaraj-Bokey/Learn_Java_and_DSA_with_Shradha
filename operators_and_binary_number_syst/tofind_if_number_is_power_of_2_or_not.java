package operators_and_binary_number_syst;
//find_if_number_is_power_of_2_or_not
import java.util.*;
public class tofind_if_number_is_power_of_2_or_not
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int input = sc.nextInt();

        int num = 1;
        for(int i = 1; i > 0; i++)
        {
            num = num * 2;
            if(input == num)
            {
                System.out.println("Input is power of 2");
                break;
            }
            
            if(input <= num)
            {
                System.out.println("Input is not a power of 2");
                break;
            }

        }
        
        sc.close();
    }
}
