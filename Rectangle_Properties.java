//Write a Java program to print the area and perimeter of a rectangle.

import java.util.*;

public class Rectangle_Properties{
    public static void main(String arg[]){
        Scanner input =new Scanner(System.in);
        int length=input.nextInt();
        int breath=input.nextInt();
        System.out.println("Area of Rectangle:- "+length*breath);
        System.out.println("Perimeter of Rectangle:- "+2*(length+breath));
    };
};