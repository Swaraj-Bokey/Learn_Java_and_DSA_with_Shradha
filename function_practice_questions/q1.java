package function_practice_questions;
//Enter three numbers from user and make a function to print their average
import java.util.*;
public class q1 
{
    public static int avg(int a, int b, int c)
    {
        return (a + b + c)/3;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter 3 numbers a, b, and c for their average");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("avg of inputed 3 numbers is " + avg( a, b, c));
        sc.close();
    }
}
