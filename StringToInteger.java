//Write a Java program to convert a string to an integer.

import java.util.*;

public class StringToInteger {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = input.nextLine();
		int result = Integer.parseInt(str1);
        System.out.printf("The integer value is: %d",result);
		System.out.printf("\n");
    };
};
