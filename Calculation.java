//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.*;

public class Calculation{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);
    };
};