package bitmanipulationoperation;
//identify wheather a bit is 0 or 1 at a purticular position
//Get the third bit (position = 2) of a number n. (n=0101)
/* Solution method */
/*      //bitmask = (1<<i)
        //operation is (and)
        //answerframe = (bitmask operator n) */
import java.util.*;
class sp_getbit 
{
    public static void main(String args[])
    {
        /*//bitmask = (1 << i)
        //operation is (and)
        //answerframe = (bitmask operator n)*/
        System.out.println("Enter number to get bit at purticular position");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter position of bit to be searched");
        int position = sc.nextInt();
        
        int bitmask = 1 << position;
        int answerframe = bitmask & n;
        
        if(answerframe == 0)
        {
            System.out.println("Required bit is 0");
        }
        else
        {
            System.out.println("Required bit is 1");
        }
        
        sc.close();
    }
}