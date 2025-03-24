/* print  
 *                 *
 * *             * *
 *   *         *   *
 *     *     *     *
 *       * *       *
 *       * *       *
 *     *     *     *
 *   *         *   *
 * *             * *
 *                 *

  
 */
 
public class advanced_patterns_hwp1
{
    public static void main(String[] args)
    {
        int n = 5, m = 10;
        // upper half
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= m; j++)
            {
               if(j == 1 || j == m || j == i || j == ((m+1) - i))
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

        //lower half
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= m; j++)
            {
               if(j == 1 || j == m || j == i || j == ((m+1) - i))
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
