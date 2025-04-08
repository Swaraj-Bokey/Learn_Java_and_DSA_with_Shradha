package arrays;
import java.util.*;
public class search_element_x_in_array 
{
    public static void main(String args[])    
    {
        System.out.println("Enter an array size ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        //input
        System.out.println("Enter elements in array a of size " + size);
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        
        //input
        System.out.println("Enter element x to be searched ");
        int x = sc.nextInt();
        for(int i = 0; i < size; i++)
        {
            if(a[i] == x)
            {
                System.out.println("Element x found at location " + i);
            }
        }
        if(a[size-1] != x)
        {
            System.out.println("Element is not present in array a");
        }
        sc.close();
    }
}
