import java.util.Scanner;

public class Q21 {
    public static void main(String arg[]){
        int dec_num, quot, i=1, j;
        int octal_num[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        dec_num=sc.nextInt();
        quot=dec_num;
        while(quot!=0){
            octal_num[i++]=quot%8;
            quot=quot/8;
        }
        System.out.print("octal numer is : ");
        for(j=i-1;j>0;j--){
            System.out.print(octal_num[j]);
        }
    }
}
