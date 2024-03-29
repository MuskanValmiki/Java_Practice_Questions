import java.util.Scanner;

import org.omg.CORBA.portable.RemarshalException;

import java.lang.Math;

public class Q39 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter to check armstrong or not");
        int num=sc.nextInt();
        int m=num;
        int remender=0;
        int sum=0;
        while(num>0){
            remender=num%10;
            sum+=Math.pow(remender,3);
            num=num/10;
        }
        if(sum==m){
            System.out.println("Armstrong: "+sum);
        }else{
            System.out.println("Not Armstrong: "+sum);
        }
    }
}
