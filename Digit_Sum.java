//Write a Java program and compute the sum of an integer's digits.

import java.util.*;

public class Digit_Sum{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int Digit=input.nextInt();
        int sum=0;
        while (Digit!=0){
            int remender=Digit%10;
            sum=sum+remender;
            Digit=Digit/10;
        };
        System.out.println("Digit sum:- "+sum);
    };
};