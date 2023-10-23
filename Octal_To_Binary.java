//Write a Java program to convert a octal number to a binary number.

import java.util.*;

public class Octal_To_Binary{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
        long octal_num, tempoctal_num, binary_num, place;
        int rem;
        octal_num = input.nextLong();
        tempoctal_num = octal_num;
        binary_num = 0;
        place = 1;
        while (tempoctal_num != 0){
            rem = (int)(tempoctal_num % 10);
            binary_num = octal_numvalues[rem] * place + binary_num;
            tempoctal_num /= 10;
            place *= 1000;
        };
        System.out.print("Equivalent binary number: " + binary_num+"\n");
    };
};