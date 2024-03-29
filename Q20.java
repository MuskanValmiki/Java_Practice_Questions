import java.util.Scanner;

public class Q20 {
    public static void main(String arg[]){
        int decimal_num,remainder;
        String hexdec_num="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        decimal_num=sc.nextInt();
        while (decimal_num > 0) {
            remainder = decimal_num % 16;
            hexdec_num = hex[remainder] + hexdec_num;
            decimal_num = decimal_num / 16;
        }
      System.out.print("Hexadecimal number is: " + hexdec_num + "\n");
    }
}
