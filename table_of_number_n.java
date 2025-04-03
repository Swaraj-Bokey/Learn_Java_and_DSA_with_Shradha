//Make a function to print the table of a given number n.

import java.util.*;
public class table_of_number_n 
{
    public static void tableOfNumberN(int n)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente value of n");
        int n = sc.nextInt();
        tableOfNumberN(n);
        sc.close();
    }
}
