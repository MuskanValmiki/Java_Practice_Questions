import java.util.Scanner;

public class Q29 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want reverse: ");
        int num=sc.nextInt();
        int reverse=0;
        while (num>0){
           reverse=(reverse*10)+num%10;
           num=num/10;
        }
        System.out.println("reverse: "+reverse);
    }
}
