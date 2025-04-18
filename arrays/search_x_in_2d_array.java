package arrays;
import java.util.*;
//search x in 2d inputed array
public class search_x_in_2d_array
{
    public static void main(String args[])
    {
        System.out.println("Enter rows and columns of 2d array");
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int a[][] = new int[rows][columns];

        //input
        System.out.println("Input elements in array");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter value of element x to be searched in 2d array a");
        int x = sc.nextInt();
        //search x
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(a[i][j] == x)
                {
                    System.out.println("Element " + x + " occurs at index " + i + "," + j);
                }
            }
        }
        sc.close();
    }
}
