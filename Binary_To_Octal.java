//Write a Java program to convert a binary number to an octal number.

import java.util.*;

public class Binary_To_Octal{
    public static void main(String arg[]){
        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
        int octnum[] = new int[100];
        Scanner input = new Scanner(System.in);
        binnum = input.nextInt();
        binnum1=binnum;
        while(binnum>0){
            rem = binnum % 10;
            decnum = decnum + rem*i;
            i = i*2;
            binnum = binnum/10;
        };
        i=1;
        quot = decnum;
        while(quot>0){
            octnum[i++] = quot % 8;
            quot = quot / 8;
        };
        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
        for(j=i-1; j>0; j--){
            System.out.print(octnum[j]);
        };
    };
};