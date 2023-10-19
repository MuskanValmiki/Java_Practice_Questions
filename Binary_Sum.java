// //Write a Java program to add two binary numbers.

import java.util.*;

public class Binary_Sum{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        long binary1=input.nextInt();
        long binary2=input.nextInt();
        int i=0;
        int remainder=0;
        int [] sum=new int[20];
        while (binary1 != 0 || binary2 != 0){
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0){
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0){
            System.out.print(sum[i--]);
        }
        System.out.print("\n");  
    };
};
