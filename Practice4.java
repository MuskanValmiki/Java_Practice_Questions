import java.util.*;

interface Area {
    final static float PI = 3.14F;
    float calculate(float x, float y);
}

class Rectangle implements Area {
    public float calculate(float x, float y) {
        return x * y;
    }
}

class Circle implements Area {
    private float pi;

    public float calculate(float x, float y) {
        return pi * x * x;
    }
}

public class Practice4 {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Area a;
        a = rect;
        System.out.println("Area of Rectangle = " + a.calculate(10, 20));
        a = cir;
        System.out.println("Area of Circle = " + a.calculate(10, 20));
    }
}

//interface implementation with the help of static keyword.
