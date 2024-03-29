import java.util.Scanner;
public class Q26 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();
        System.out.println("Enter choice 1.Add/n 2.Substract/n 3.Multiply/n 4.Divide:");
        int ch=sc.nextInt();
        if (ch==1){
            System.out.println(num1+num2);
        }else if(ch==2){
            System.out.println(num1-num2);
        }else if(ch==3){
            System.out.println(num1*num2);
        }else if (ch==4){
            System.out.println(num1/num2);
        }else{
            System.out.println("you enter wrong option");
        }
    }  
}
