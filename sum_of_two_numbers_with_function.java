import java.util.*;

public class sum_of_two_numbers_with_function 
{
   
    public static int calculateSum(int a, int b)    
    {
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("Sum of 2 numbers is " + sum);
        sc.close();
    }
}
