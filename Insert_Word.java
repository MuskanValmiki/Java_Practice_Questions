//Write a Java program to insert a word in the middle of another string.

import java.util.*;

public class Insert_Word {
    public static void main(String[] args) {
        // Define the main string and the word to insert
        String main_string = "Python 3.0";
        String word = "Tutorial";

        // Create a new string by concatenating substrings
        String result = main_string.substring(0, 7) + word + main_string.substring(6);

        // Print the resulting string
        System.out.println(result);
    };
};
