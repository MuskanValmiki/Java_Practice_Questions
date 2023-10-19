//Write a Java program to convert a decimal number to a hexadecimal number.

import java.util.*;

public class Decimal_To_Hexadecimal{
      public static void main(String args[]){
        int dec_num, rem;
        String hexdec_num=""; 
        /* hexadecimal number digits */
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        Scanner input = new Scanner(System.in);
        dec_num = input.nextInt();
        while(dec_num>0){
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        };
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");         
    };
};