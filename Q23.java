import java.util.Scanner;

public class Q23 {
    public static void main(String arg[]){
        int[] hexadecimal=new int[1000];
        int i=1, j=0, remainder, decimal=0, bin;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        bin=sc.nextInt();
        while(bin>0){
            remainder=bin%2;
            decimal=decimal+remainder*i;
            i=i*2;
            bin=bin/10;
        }
        i=0; 
       while(decimal != 0){
        hexadecimal[i]=decimal%16; 
        decimal=decimal/16;
        i++;
       }
       System.out.print("hexadecimal number: ");
       for(j=i-1;j>=0;j--){
        if(hexadecimal[j]>9){
            System.out.print((char)(hexadecimal[j]+55));
        }else{
            System.out.print(hexadecimal[j]);
        }
       }
    }
}
