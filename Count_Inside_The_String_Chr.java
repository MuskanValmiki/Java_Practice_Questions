//Write a Java program to count letters, spaces, numbers and other characters in an input string.
// demo string -Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33

import java.util.*;

public class Count_Inside_The_String_Chr{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        char [] string=input.nextLine().toCharArray();
        int letters_count=0;
        int spaces_count=0;
        int numbers_count=0;
        int others_count=0;
        for(int i=0;i<string.length;i++){
            if(Character.isLetter(string[i])){
                letters_count++;
            }
            if(Character.isDigit(string[i])){
                numbers_count++;
            }
            if(Character.isSpaceChar(string[i])){
                spaces_count++;
            }
            else{
                others_count++;
            }
        };
        System.out.println("letter: " + letters_count);
        System.out.println("space: " + spaces_count);
        System.out.println("number: " + numbers_count);
        System.out.println("other: " + others_count);
    };
};

// public class Count_Inside_The_String_Chr{
//     public static void main(String arg[]){
//         String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//         // Call the count method to analyze the characters in the test string
//         count(test);
//     };

//     public static void count(String x) {
//         // Convert the input string to a character array
//         char[] ch = x.toCharArray();
        
//         // Initialize counters for letters, spaces, numbers, and other characters
//         int letter = 0;
//         int space = 0;
//         int num = 0;
//         int other = 0;
        
//         // Iterate through the character array to categorize characters
//         for (int i = 0; i < x.length(); i++) {
//             // Check if the character is a letter
//             if (Character.isLetter(ch[i])) {
//                 letter++;
//             }
//             // Check if the character is a digit (number)
//             else if (Character.isDigit(ch[i])) {
//                 num++;
//             }
//             // Check if the character is a space
//             else if (Character.isSpaceChar(ch[i])) {
//                 space++;
//             }
//             // Character falls into the "other" category if none of the above conditions are met
//             else {
//                 other++;
//             }
//         };
        
//         // Display the original string
//         System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        
//         // Display the counts of letters, spaces, numbers, and other characters
//         System.out.println("letter: " + letter);
//         System.out.println("space: " + space);
//         System.out.println("number: " + num);
//         System.out.println("other: " + other);
//     };
// };