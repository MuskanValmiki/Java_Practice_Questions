import java.util.Scanner;

public class pali {
    public static void main(String args[]){
        String s=new String();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no:");
        s=sc.nextLine();
        int i,j,flag;
        i=0;
        j=s.length()-1;
        flag=0;
        while(i<j && flag==0){
            if(s.charAt(i)!=s.charAt(j)){
                flag=1;
            }
            i+=1;
            j-=1;
        }
        if(flag==0){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
