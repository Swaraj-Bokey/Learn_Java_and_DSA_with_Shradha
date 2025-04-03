import java.util.*;

public class check_for_even_odd_property_using_function 
{
    public static String evenOddCheck(int n)
    {
        if(n % 2 == 0)
        {
            return "n is even";
        }
        else
        {
            return " n is odd";
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        System.out.println(evenOddCheck(n));
        sc.close();
    }
}
