package bitmanipulationoperation;
// Write a program to count the number of 1’s in a binary representation of the number.
/*concept 
check if the last bit is 1.
Right shit to process the next bit

*/
import java.util.*;

public class hp_count_1s
{
     public static void main(String args[])
     {
          //input
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number to count its 1s");
          int n = sc.nextInt();

          int result = count_is(n);
          System.out.println(result);
          sc.close();
     }

     public static int count_is(int n)
     {
          int count = 0;
          while(n > 0)
          {
               count = count + (n & 1);// check if the last bit is 1.
               n = n >> 1;// Right shit to process the next bit
          }
          return count;
     }
     
}