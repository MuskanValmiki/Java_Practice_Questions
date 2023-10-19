//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.*;

public class Average_Of_Number{
    public static void main(String arg[]){
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            int num=input.nextInt();
            sum=sum+num;
            i++;
        };
        System.out.println("Average of Number:- "+sum/n);
    };
};