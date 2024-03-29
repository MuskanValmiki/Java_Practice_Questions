import java.util.Scanner;
public class Q31 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n=sc.nextInt();
        int Even_Sum=0;
        int Odd_Product=1;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                Even_Sum+=digit;
            }else{
                Odd_Product*=digit;
            }
            n=n/10;
        }
        System.out.println("Sum of even numbers: "+Even_Sum);
        System.out.println("Product of odd numbers: "+Odd_Product);
    }
}
