// c11_print_n_for_given_number_n 
import java.util.*;

class c11_print_n_for_given_number_n 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for finding its table");
        int n = sc.nextInt();
        System.out.println("required table is as followos");
        for(int i=1; i<11; i++)
        {
            System.out.println(n + " * " + i + "=" + (n*i) );
        }
        sc.close();
    }
}
