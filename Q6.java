import java.util.Scanner;

public class Q6 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1=sc.nextInt();
        System.out.println("Enter num2 :");
        int num2=sc.nextInt();
        System.out.println("Enter Operators +,-,*,/,mod");
        char operator = sc.next().charAt(0);
        sc.close();
        if(operator=='+'){
            System.out.println(num1+num2);
        }
        else if(operator=='-'){
            System.out.println(num1-num2);
        }
        else if(operator=='*'){
            System.out.println(num1*num2);
        }
        else if(operator=='/'){
            System.out.println(num1/num2);
        }
        else if(operator=='%'){
            System.out.println(num1%num2);
        }
        else{
            System.out.println("wrong operator");
        }
    }
}
