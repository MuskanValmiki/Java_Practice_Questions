//Write a Java program to find the penultimate (next to the last) word in a sentence.

import java.util.*;

public class LastWord {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();
        String[] words = line.split("[ ]+");
        System.out.println("Penultimate word: "+words[words.length - 2]);
    };
};
