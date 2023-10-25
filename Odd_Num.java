//Write a Java program to print odd numbers from 1 to 99. Prints one number per line.

public class Odd_Num {
    public static void main(String arg[]){
        int i=1;
        while(i<100){
            if(i%2!=0){
                System.out.println("Odd number 1 to 99:- "+i);
            };
            i++;
        };
    };
};
