package strigbuilderfolder;
// find_cumulative_length_of_string_array_by_stringbuilder class
//incompleate
import java.util.*;
public class find_cumulative_length_of_string_array_by_stringbuilder
{
    public static void main(String args[])    
    {
        System.out.println("Enter size of string array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        
        //declare StringBuilder array sb
        StringBuilder sb[] = new StringBuilder[size];

        int len = 0;
        //input in stringarray sb
        for(int i = 0; i < size; i++)
        {
            sb[i] = new StringBuilder(sc.nextLine());

            len = len + sb[i].length();
        }
        System.out.println(len);

        sc.close();
    }
}
