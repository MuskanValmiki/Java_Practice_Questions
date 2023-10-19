// Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.*;

public class Table{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+" X "+i+" = "+n*i);
            i++;
        };
    };
};
