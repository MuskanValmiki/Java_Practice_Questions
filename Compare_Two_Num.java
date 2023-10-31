//Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, 
//return 0 and find the smallest value if the two values have the same remainder when divided by 6.

import java.util.*;

public class Compare_Two_Num {
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        if(num1==num2){
            System.out.println("Both are same "+0);
        }else if(num1%6==num2%6 && num1>num2){
            System.out.println("Smaller value is :- "+num2);
        }else if(num1%6==num2%6 && num1<num2){
            System.out.println("Smaller value is :- "+num1);
        }
        else if(num1>num2){
            System.out.println("Largest value is :- "+num1);
        }else{
            System.out.println("Largest value is :- "+num2);
        };
    };
};
