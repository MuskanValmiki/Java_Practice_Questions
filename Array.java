import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter n=");
            a[i]=sc.nextInt();
        }
        System.out.println("Here we will get all element of array");
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}
