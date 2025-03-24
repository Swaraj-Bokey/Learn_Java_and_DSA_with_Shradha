/*print hollow Rhombus
      *****
     *   *
    *   *
   *   *
  *****
 */

 public class advanced_pattern_hwp2
 {
    public static void main(String[] args)
    {
        int n = 5, m = 10;
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= m; j++)
            {
                if(( i == 1) && (j >=5 && j <= 9))
                {
                    System.out.print("*");
                }
                else if(( i == 5) && (j >= 1) && (j <= 5))
                {
                    System.out.print("*");
                }
                else if(( i != 1) && (i != 5) && ((i + j) == 6) || ((i + j) == 10))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();    
        }
                   
    }
 }
 