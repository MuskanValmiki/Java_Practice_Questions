//Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have 
//the same rightmost digit. The integers are non-negative.

import java.util.*;

public class Non_Neg {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();  
		System.out.print("Input the second number: ");
		int y = in.nextInt(); 
		System.out.print("Input the third number : ");
        int z = in.nextInt(); 
        System.out.print("The result is: "+test_last_digit(x, y, z,true));
		System.out.print("\n");
    };
    public static boolean test_last_digit(int p, int q, int r, boolean xyz){
	    return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    };
};
