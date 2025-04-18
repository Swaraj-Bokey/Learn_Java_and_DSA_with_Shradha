package arrays;
import java.util.*;
//print transpose of matrix
public class transpose_of_matrix 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix a");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];

        System.out.println("Input matrix");
        //input
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //transpose o matrix
        for(int j = 0; j < m; j++)
        {
            for(int i = 0; i < n; i++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
