//Write a Java program to compare two numbers.

import java.util.*;

public class Compare_Two_Number{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println(num1 != num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
    };
};