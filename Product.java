//Write a Java program that takes two numbers as input and displays the product of two numbers.

import java.util.*;

public class Product{
    public static void main(String arg[]){
        Scanner input= new  Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println(num1*num2);
    };
};