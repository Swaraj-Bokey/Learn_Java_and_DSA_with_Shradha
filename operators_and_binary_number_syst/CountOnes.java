package operators_and_binary_number_syst;
// count_number_of_1s_in_binary_representation_of_number
//incompleate
import java.util.*;
public class CountOnes 
{
    //num = n
    public static int countOnes(int n) 
    {
        int count = 0;
        while (n != 0) 
        {
            count += n & 1; // Check if the last bit is 1
            n >>= 1;        // Shift right to check the next bit
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Number of 1’s in binary representation: " + countOnes(num));
    }
}
