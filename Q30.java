import java.util.Scanner;
public class Q30 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the digit which digit sum you want: ");
      int sum=0;
      int n=sc.nextInt();
      while(n>0){
        sum+=n%10;
        n=n/10;
      }
      System.out.println("sum of digits: "+sum);
    }
}
