//Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions.

import java.util.*;

public class Compare_Three_Num {
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        if(Math.abs(num1-num2)>=20 || Math.abs(num2-num3)>=20 || Math.abs(num3-num1)>=20){
           System.out.println(true);
        }else{
            System.out.println(false);
        };
    };
};
