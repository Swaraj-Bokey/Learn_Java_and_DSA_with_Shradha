//Ask the user to enter the number of the month & print the name of the month.
//For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on

import java.util.*;

class c6_month_number_to_month_name
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter month number");
        
        int month_number = sc.nextInt();

        switch(month_number)
        {
            case 1:
                System.out.println("Curresponding month is January");
                break;
            
            case 2:
                System.out.println("Curresponding month is February");
                break;
                
            case 3:
                System.out.println("Curresponding month is March");
                break;
            
            case 4:
                System.out.println("Curresponding month is April");
                break;
            
            case 5:
                System.out.println("Curresponding month is May");
                break;
                
            case 6:
                System.out.println("Curresponding month is June");
                break;
            
            case 7:
                System.out.println("Curresponding month is July");
                break;
            
            case 8:
                System.out.println("Curresponding month is August");
                break;
                
            case 9:
                System.out.println("Curresponding month is September");
                break;
            
            case 10:
                System.out.println("Curresponding month is October");
                break;
            
            case 11:
                System.out.println("Curresponding month is November");
                break;
                
            case 12:
                System.out.println("Curresponding month is December");
                break;
            
        }
        sc.close();
    }

}