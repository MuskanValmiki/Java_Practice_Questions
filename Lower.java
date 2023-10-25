//Write a Java program to convert a string into lowercase.

import java.util.*;

public class Lower {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    };
};
