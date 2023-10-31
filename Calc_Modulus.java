//Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.

import java.util.*;

public class Calc_Modulus {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int Quotient = (num1 / num2);
        System.out.println((num1-(num2*Quotient)));
    };
};
