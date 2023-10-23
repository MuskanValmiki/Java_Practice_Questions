//Write a Java program to convert a hexadecimal value into a decimal number.

import java.util.*;

public class Hexadecimal_To_Decimal{
    public static int hex_to_decimal(String s){
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        };
        return val;
    };
    public static void main(String arg[]){
        String hexdec_num;
        int dec_num;
        Scanner input=new Scanner(System.in);
        hexdec_num=input.nextLine();
        dec_num = hex_to_decimal(hexdec_num);
        System.out.print("Equivalent decimal number is: " + dec_num+"\n");
    };
};