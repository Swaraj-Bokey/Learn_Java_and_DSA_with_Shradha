/*     print
       1
     2 1 2    
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5
*/ 
public class hwp3 
{
    public static void main(String[] args)
    {
        int n = 5;
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = n; j >= i; j--)
            {
                System.out.print(" ");
            }

            for(int k = i; k>=1; k--)
            {
                System.out.print(k);
            }
              
            if(i >= 2)    
            {
                for(int t = 2; t <= i; t++)
                {
                    System.out.print(t);
                }
            }
            System.out.println();
        }
    }
}
