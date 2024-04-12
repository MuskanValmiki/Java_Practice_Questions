import java.util.Scanner;

public class data {
    public static void main(String args[]){
        // String name=new String ();
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter you name");
        // name=sc.next();
        // System.out.println("Hell MR./MS/Mrs"+name);
        
        // String s=new String();
        // int i;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter string:");
        // s=sc.next();
        // System.out.println("the string is "+s);
        // System.out.println("the length of the string is  "+s.length());
        // for(i=0;i<s.length();i++){
        //     System.out.println(s.charAt(i));
        // }

        String s=new String ();
        int i;
        int val=0;
        int con=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        s=sc.nextLine();
        s=s.toUpperCase();
        for(i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                if(c=='A'|| c=='E'|| c=='I' || c=='O'|| c=='U'){
                    val++;
                }else{
                    con++;
                }
            }
        }
        System.out.println("vowel "+val +" cons "+con);

        // String s=new String ();
        // int i;
        // int count=0;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter string:");
        // s=sc.nextLine();
        // for(i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     char d=s.charAt(i+1);
        //     if(c==' '&& i<s.length()-1 && d!=' '){
        //         count++;
        //     }
        // }
        // if(!s.isEmpty()){
        //     count++;
        // }
        // System.out.println("total words:"+count);
        // sc.close();
    }
}
