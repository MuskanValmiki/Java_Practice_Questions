import java.util.Scanner;

public class Q19 {
    public static void main(String arg[]){
        int decimal_num, quot, i = 1, j;
        int binary_num[] = new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        decimal_num=sc.nextInt();
        quot=decimal_num;
        while (quot != 0) {
            binary_num[i++] = quot % 2;
            quot = quot / 2;
        }
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(binary_num[j]);
        }
        System.out.print("\n");
    }   
}
