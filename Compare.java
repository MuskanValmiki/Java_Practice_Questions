import java.util.Scanner;

public class Compare {
    public static void main(String args[]){
        String s1=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        s1=sc.nextLine();
        System.out.println("enter string s2");
        String s2=new String();
        s2=sc.nextLine();
        if(s1.compareTo(s2)==0){
            System.out.println("equal string");
        }
        else if(s1.compareTo(s2)>0){
            System.out.println("s1 is greater then s2");
        }else{
            System.out.println("s1 is less than s2");
        }
    }
}
