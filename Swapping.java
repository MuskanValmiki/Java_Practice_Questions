// Write a Java program to swap two variables.

public class Swapping{
    public static void main(String arg[]){
        int a=15;
        int b=25;
        System.out.println("Before a and b value:- "+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After a and b value:- "+a+" "+b);
    };
};