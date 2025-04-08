
package arrays;
// Take an array of names as input from user and print them on screen
import java.util.*;
public class arrayhwp1 
{
    public static void main(String args[])
    {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        String s[] = new String[size];

        System.out.println("Enter an array of strings that include names of people");
        //input
        for(int i = 0; i < size; i++)
        {
            s[i] = sc.next();
        }
        
        //output
        System.out.println("array elements are");
        for(int i = 0; i < size; i++)
        {
            System.out.println(s[i]);
        }
        sc.close();

    }
}
