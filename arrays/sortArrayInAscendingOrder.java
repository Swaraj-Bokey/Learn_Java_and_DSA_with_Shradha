package arrays;
//Take an array of numbers as input and check if it is an array sorted in ascending order.
import java.util.*;
public class sortArrayInAscendingOrder 
{
    public static void main(String args[])
    {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        
        boolean ascendingOrder = false;;
        for(int i = 0; i < size - 1; i++)
        {
            if(a[i] > a[i + 1])
            {
                ascendingOrder = false;
            }
            else
            {
                ascendingOrder = true;
            }    
        }
        
        if(ascendingOrder == true)
        {
            System.out.println("Array is in ascendingorder");
        }
        else
        {
            System.out.println("Array is not in  ascendingorder");
        }
        sc.close();
    }

    
}
