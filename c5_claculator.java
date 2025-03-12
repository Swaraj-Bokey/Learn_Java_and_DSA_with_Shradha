//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
//1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.

import java.util.*;
class c5_calculator
{
    public static void main(String[] args)
    {
        System.out.println("This is a calculator");
        System.out.println("Input 2 operands for their operation");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition of 2 numbers is" + "" + (a+b));
        System.out.println("subtraction of 2 numbers is" + "" + (a-b));
        System.out.println("multiplication of 2 numbers is" + "" + (a*b));
        System.out.println("Division of 2 numbers is" + "" + (a/b));
        System.out.println("reminder of 2 numbers is" + "" + (a%b));

        sc.close();


    }
}