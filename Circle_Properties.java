//Write a Java program to print the area and perimeter of a circle.

import java.util.*;

public class Circle_Properties{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int radius=input.nextInt();
        System.out.println("Perimeter of Circle:- "+2*Math.PI*radius);
        System.out.println("Are of Circle:- "+Math.PI*radius*radius);
    };
};