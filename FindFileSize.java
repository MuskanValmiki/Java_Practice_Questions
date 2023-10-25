//Write a Java program to find the size of a specified file

import java.io.File;

public class FindFileSize {
    public static void main(String args[]) {
        System.out.println("/home8$/Muskmus/Profile/Desktop/JavaPractice/abc.txt: " + new File("abc.txt").length() + " bytes");
        System.out.println("/home8$/Muskmus/Profile/Desktop/JavaPractice/test.txt : " + new File("test.txt").length() + " bytes");
    };
};