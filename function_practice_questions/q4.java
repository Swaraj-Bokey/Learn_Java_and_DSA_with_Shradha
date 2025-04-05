package function_practice_questions;
//input radius output circumference
import java.util.*;

public class q4
{
    public static double circumference(double r)
    {
        double circumference = 2 * 3.14 * r;
        return circumference;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter radius of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println("Circummference of circle is "+ circumference(r));
        sc.close();
    }

}
