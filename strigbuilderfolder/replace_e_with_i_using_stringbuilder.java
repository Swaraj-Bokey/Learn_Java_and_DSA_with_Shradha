package strigbuilderfolder;
// replace_e_with_i_using_stringbuilder
import java.util.*;
public class replace_e_with_i_using_stringbuilder 
{
    public static void main(String args[])     
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string sb");
        StringBuilder sb = new StringBuilder(sc.next());

        for(int i = 0; i < sb.length(); i++)
        {
            if(sb.charAt(i) == 'e')
            {
                sb.setCharAt(i, 'i');
                System.out.println(sb);
                break;
            }
        }
        
        sc.close();
    }
}
