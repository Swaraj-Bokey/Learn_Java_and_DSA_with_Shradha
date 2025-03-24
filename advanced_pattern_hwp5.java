/* print inverte half Pyramid
1111
222
33
4
 
 */
public class advanced_pattern_hwp5 
{
    public static void main(String[] args)   
    {
        int n = 4; //number_of_rows
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= (5 - i); j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
