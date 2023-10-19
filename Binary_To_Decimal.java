//Write a Java program to convert a binary number to a decimal number.

import java.util.*;

public class Binary_To_Decimal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        binaryNumber = input.nextLong();
        while (binaryNumber != 0){
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        };
    System.out.println("Decimal Number: " + decimalNumber);
    };
};