import java.util.Scanner;

public class Q22 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        long binaryNumber, decimalNumber=0, j=1, remainder;
        System.out.print("Enter a binary number: ");
        binaryNumber=sc.nextLong();
        while(binaryNumber!=0){
            remainder=binaryNumber%10;
            decimalNumber=decimalNumber+remainder*j;
            j=j*2;
            binaryNumber=binaryNumber/10;
        }
        System.out.print("decimal number: "+decimalNumber);
    }
}
