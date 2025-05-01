package bitmanipulationoperation;

import java.util.*;
public class hp_dec_2_bin_and_bin_dec
{
    public static int binary_to_decimal(int bn)
    {
        int p = 1;
        int dn = 0;
        while(bn != 0)
        {
            
            int bit = 1 & bn;
            dn = dn + bit * p;
            p = p * 2;
            bn = bn >> 1;
                
        }
        return dn;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert binary number");
        int bn = sc.nextInt(); 
        int result = binary_to_decimal(bn);
        System.out.println(result);
        sc.close();
    }

    
}