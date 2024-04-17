import java.util.Scanner;

public class meth {
    public static void main(String args[]){
        String s1=new String();
        String s2=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        s1=sc.nextLine();
        System.out.println("enter second string");
        s2=sc.nextLine();
        String s3=new String();
        s3=s1.concat(s2);
        System.out.println("concatenate "+s3);
        System.out.println("indexOf "+s1.indexOf('a'));
        System.out.println("inexOf "+s1.indexOf('a',3));
        System.out.println("subString "+s1.substring(2));
        // System.out.println("subString "+s1.substring(2,4));
    }
}
