package bitmanipulationoperation;
// Write a program to toggle a bit a position = “pos” in a number “n”.
//aso known as update bit()
/* Concept
int bitmask = 1 << p;
answerframe = bitmask ^ n; */

import java.util.*;
public  class hp_toggle_a_bit_position_p_in_number_n
{
    public static void main(String args[])
    {
     
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("Enter number n and position p to be toggled");
        int n = sc.nextInt(), p = sc.nextInt();

        //Concept
        /*int bitmask = 1 << p;
        answerframe = bitmask ^ n;
        */

        int bitmask = 1 << p;
        int answerframe = bitmask ^ n;
        System.out.println(answerframe);
        sc.close();
        
    }     
}


