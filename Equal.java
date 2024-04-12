import java.util.Scanner;

public class Equal {
    public static void main(String args[]){
        String s1=new String();
        String s2=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string:");
        s1=sc.nextLine();
        System.out.println("Enter 2nd string:");
        s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("equal string");
        }
        else if (s1.equalsIgnoreCase(s2)){
            System.out.println("equals string from ignore case sensitive.");
        }else{
            System.out.println("not equal string");
        }
    }
}
