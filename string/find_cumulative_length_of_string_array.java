package string;
//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class find_cumulative_length_of_string_array 
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string array");
        int size = sc.nextInt();
        String s[] = new String[size];
    
        //input array
        System.out.println("Enter elements of string array");
        int number, sum = 0;
        for(int i = 0; i < size; i++)
        {
            s[i] = sc.next();
            number = s[i].length();
            sum = sum + number;
        }
        System.out.print("Required length of all strings is " + sum);

        sc.close();
    }
}