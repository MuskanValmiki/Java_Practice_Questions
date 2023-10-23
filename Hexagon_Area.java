//Write a Java program to compute hexagon area (6 * s^2)/(4*tan(π/6)).

import java.util.*;

public class Hexagon_Area{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int side=input.nextInt();
        double Hexagon_Area=(6 * (side * side)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("Area of Hexagon:- "+Hexagon_Area);
    };
};