//Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first 
//number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger 
//than the first number.

import java.util.*;

public class SmallerNum {
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        System.out.print("The result is: "+test(num1, num2, num3,true));
		System.out.print("\n");
    };
    public static boolean test(int p, int q, int r, boolean num1num2num3){
	    if(num1num2num3)
		  return (r > q);
	    return (q > p && r > q);
    };
};
