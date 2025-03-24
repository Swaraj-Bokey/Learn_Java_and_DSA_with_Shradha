/*print Pascal's triangle
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 
 */
public class advanced_pattern_hwp3 
{
    public static void main(String[] args)
    {
        int n = 5, number = 1; //number of rows
        
            for(int j = 1; j <= 5; j++)
            {
                System.out.println(number);
                number = number * 11;
            }
            System.out.println();
        
    }
}
