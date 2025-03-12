//Make a program that takes the radius of a circle as input,
//calculates its radius and area and prints it as output to the user

import java.util.*;

public class c3_radius_of_circle 
{
    public static void main(String[] args)    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int r = sc.nextInt();

        double circumference_of_circle = 2 * 3.14 * r;
        double area_of_circle = 3.14 * r * r;

        System.out.println("circumference_of_circle is" + circumference_of_circle);
        System.out.println("Area of circle is" + area_of_circle);

        sc.close();

    }
}
