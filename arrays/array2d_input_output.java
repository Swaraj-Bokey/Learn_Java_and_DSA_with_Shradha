package arrays;
import java.util.*;
public class array2d_input_output 
{
    public static void main(String args[])
    {
        System.out.println("Enter rows and columns of 2d array a");
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int columns = sc.nextInt(); 
        int a[][] = new int[rows][columns]; // declearation
        
        System.out.println("Input elements in array");
        //input
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Required inputed array is ");
        //output
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
