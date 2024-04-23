import java.util.Scanner;

public class Short {
    public static void main(String args[]){
        int i,j,x;
        char c,d;
        Scanner sc=new Scanner(System.in);
        String s1=new String();
        System.out.println("Enter string:");
        s1=sc.nextLine();
        i=0;
        j=s1.length()-1;
        while(s1.charAt(j)!=' '){
            j--;
        }
        x=j;
        while(i<=j){
            if(i==0 || s1.charAt(i-1)==' '){
                if(i == 0) {
                    System.out.print(s1.charAt(i) + ".");
                } else {
                    System.out.print(s1.toUpperCase().charAt(i) + ".");
                }
            }
            i++;
        }
        System.out.print(s1.substring(x));
    }
}
