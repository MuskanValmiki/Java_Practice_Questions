import java.util.Scanner;

public class Convert {
    public static void main(String args[]){
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string in lowercase");
        str=sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println("enter string in uppercase");
        str=sc.nextLine();
        System.out.println(str.toLowerCase());
    }
}
