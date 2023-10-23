//Write a Java program to compute the area of a polygon (n*s^2)/(4*tan(π/n)) Input the number of sides on the polygon: 7 Input the length of one of the sides: 6.

import java.util.*;

public class Polygon_Area{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int no_of_side=input.nextInt();
        int length_side=input.nextInt();
        double Polygon_Area=(no_of_side*(length_side*length_side))/(4.0*Math.tan((Math.PI/no_of_side)));
        System.out.println("Area of Polygon:- "+Polygon_Area);
    };
};