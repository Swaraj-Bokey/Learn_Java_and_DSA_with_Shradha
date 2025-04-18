package arrays;
import java.util.*;
public class spiralmatrix 
{
    public static void main(String args[]) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of rows and colmns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];

        System.out.println("Enter elements of matrix a");
        for (int i = 0; i < n; i++)    
        {
            for(int j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Elements of matrix a are ");
        for (int i = 0; i < n; i++)    
        {
            for(int j = 1; j < m; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        int r_s = 0;
        int r_e = n-1;
        int c_s = 0;
        int c_e = m-1;
        
        //To print spiral order matrix
        System.out.println("Required spiaral traversal of elements is as fpllows");
        while(r_s <= r_e && c_s <= c_e)
        {
            //1
            for(int col = c_s; col <= c_e; col++)
            {
                System.out.print(a[r_s][col] + " ");
            }
            r_s++;

            //2
            for(int row = r_s; row <= r_e; row++)
            {
                System.out.print(a[row][c_e] + " ");
            }
            c_e--;

            //3
            for(int col = c_e; col >= c_s; col--)
            {
                System.out.print(a[r_e][col] + " ");
            }
            r_e--;

            //4
            for(int row = r_e; row >= r_s; row--)
            {
                System.out.print(a[row][c_s] + " ");
            }
            c_s++;

            System.out.println();
        }


        sc.close();

    }    
}
