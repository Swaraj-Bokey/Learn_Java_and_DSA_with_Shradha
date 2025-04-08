package arrays;
import java.util.*;
public class array_input_output 
{
    public static void  main(String args[])    
    {
        System.out.println("Input size of array a");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];  

        // input
        System.out.println("Input elemnents of array a with size " + size);
        for(int i = 0; i < size; i++)
        {
             a[i] = sc.nextInt();
        }

        // output
        System.out.println("Elements of array a with size " + size + " are listed below");
        for(int i = 0; i < size; i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
