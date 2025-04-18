import java.util.*;

public class product_of_2_numbers_using_function 
{
    public static int calculateProduct(int a, int b)    
    {
        return a * b;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product_of_2_numbers_is "+ calculateProduct(a, b));
        sc.close();
    }
}
