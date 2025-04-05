package function_practice_questions;
import java.util.*;
public class q8
{
    public static int xpown(int x, int n)
    {
        int answer = 1;
        for(int i = 1; i <= n; i++)
        {
            answer = answer * x;

        }
        return answer;
    }

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of x and n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(xpown(x,n));
        sc.close();

    }
}
