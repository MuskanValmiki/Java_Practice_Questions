//Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.

import java.util.*;

public class CheckEvenOdd {
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num%2==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        };
    };
};
