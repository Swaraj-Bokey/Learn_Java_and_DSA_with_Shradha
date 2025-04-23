package strigbuilderfolder;
//eval_username_from_email_using_stringbuilder 
import java.util.*;
public class eval_username_from_email
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email for username");
        
        StringBuilder email = new StringBuilder(sc.next());
        
        String userName = "";
        for(int i = 0; i < email.length(); i++)
        {
            if(email.charAt(i) == '@')
            {
                break;
            }
            else
            {
                userName = userName + email.charAt(i);
            }
        }
        System.out.println(userName);
        sc.close();
    }
}

