package function_practice_questions;
import java.util.*;
public class q5 
{
    public static String eliginlity(int age)    
    {
        if(age>=18)
        {
            return "person is eligible to vote";
        }
        else
        {
            return "person is not eligible to vote";
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter age to check eligiblity");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println(eliginlity(age));
        sc.close();
    }
}
