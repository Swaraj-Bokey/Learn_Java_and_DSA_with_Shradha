package bitmanipulationoperation;
// make a bit 1 at purticular position
/*solution method
/*
int bitmask = 1 << p;        
int answerframe = n | bitmask;
System.out.println(answerframe)
 */
import java.util.*;
public class sp_setbit
{
    public static void main(String args[])
    {
        //input
        System.out.println("Enter number for set bit function");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter position of bit to be set");
        int p = sc.nextInt();
        int bitmask = 1 << p;
        
        int answerframe = n | bitmask;
        System.out.println(answerframe);
        sc.close();
    }
}
