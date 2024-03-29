import java.util.Scanner;
public class Q35 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to get factorial");
        int num=sc.nextInt();
        int fact=1;
        while(num>0){
            fact=num*fact;
            num-=1;
        }
        System.out.println("Factorial : "+ fact );
    }
}
