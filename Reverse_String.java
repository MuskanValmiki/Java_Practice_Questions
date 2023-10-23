//Write a Java program to reverse a string.

import java.util.*;

public class Reverse_String{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        char [] letters=input.nextLine().toCharArray();
        for(int i=letters.length-1;i>=0;i--){
            System.out.print(letters[i]);
        };
    };
};