import java.util.Scanner;

public class Practice1 {
    public static void main(String args[]){
        StringBuffer str1=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        str1.append(sc.nextLine());
        str1.setCharAt(3, 'u');
        System.out.println(str1);
        str1.insert(3,"akku");
        System.out.println(str1);
        str1.setLength(20);
        System.out.println(str1);
        str1.setLength(5);
        System.out.println(str1);
    }
}

//StringBuffer functions uses.