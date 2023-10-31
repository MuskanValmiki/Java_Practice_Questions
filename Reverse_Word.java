//Write a Java program to reverse a word.

import java.util.*;

public class Reverse_Word {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a word: ");
        String word = in.nextLine();
        word = word.trim();
        String result = ""; 
        char[] ch=word.toCharArray();  
        for (int i = ch.length - 1; i >= 0; i--) {
                result += ch[i];
        };
        System.out.println("Reverse word: "+result.trim());      		
    };
};
