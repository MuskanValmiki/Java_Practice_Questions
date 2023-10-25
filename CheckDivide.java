//Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

public class CheckDivide {
    public static void main(String arg[]){
        int i=1;
        while(i<100){
            if(i%3==0){
                System.out.println("Divide by 3:-"+i);
            } if(i%5==0){
                System.out.println("Divide by 5:-"+i);
            } if(i%3==0 && i%5==0){
                System.out.println("Divide by 3 or 5:-"+i);
            };
            i++;
        };
    };
};
