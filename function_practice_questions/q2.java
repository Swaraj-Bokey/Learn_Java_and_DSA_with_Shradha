package function_practice_questions;
import java.util.*;
public class q2 
{
    public static int sum_of_odd_till_n(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args) 
    {
        System.out.println("enter n for required function caculation");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum_of_odd_till_n(n));
        sc.close();

    }
}
