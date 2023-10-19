//Write a Java program to convert a octal number to a decimal number.

import java.util.*;



public class Octal_To_Decimal{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        long octal_num, decimal_num = 0;
        int i = 0;
        octal_num = input.nextLong();
        while(octal_num!=0){
            decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
            octal_num = octal_num / 10;
        };
        System.out.print("Equivalent decimal number: " + decimal_num+"\n");
    };
};