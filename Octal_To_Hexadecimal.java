//Write a Java program to convert a octal number to a hexadecimal number.

import java.util.*;

public class Octal_To_Hexadecimal{
    public static void main(String arg[]){
        String octal_num, hex_num;
        int decnum;
        Scanner input = new Scanner(System.in);
        octal_num = input.nextLine();
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
        System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
    };
};