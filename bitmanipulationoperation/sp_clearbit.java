package bitmanipulationoperation;
//make a bit 0 at purticular position
/* solution method*/
/* bitmask = (1 << p);
answerframe = (n & ~(bitmask))
*/
import java.util.*;
public class sp_clearbit
{
    public static void main(String args[])
    {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose position is to be cleared");
        int n = sc.nextInt();
        System.out.println("Enter postion of number which is to be cleared");
        int p = sc.nextInt();
        
        /* method*/
         /* bitmask = (1 << p);
            answerframe = (n & ~(bitmask))
        */
        int bitmask = 1 << p;
        int answerframe = n & ~(bitmask);
        System.out.println(answerframe);

        sc.close();
    }
}
