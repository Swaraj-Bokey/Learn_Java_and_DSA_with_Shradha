package function_practice_questions;
import java.util.*;

public class q3 
{
    public static int greaterOfTwo(int a, int b)    
    {
        if(a>b)
        {
            return a;
        }
        else if(b>a)
        {
            return b;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("enter value of 2 numbers to find greater of them");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(greaterOfTwo(a,b));
        sc.close();
    }
}
