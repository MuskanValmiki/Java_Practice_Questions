import java.util.Scanner;
public class Q45 {
    // int n;
    // void getdata(int i){
    //     n=i;
    // }
    // void processdata(){
    //     int rev=0;
    //     while(n>0){
    //         rev=(rev*10)+n%10;
    //         n=n/10;
    //     };
    //     System.out.println("Reverse: "+rev);
    // }
    public static void main(String args[]){
        int m;
        reverse aa=new reverse();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        m=sc.nextInt();
        aa.getdata(m);
        aa.processdata();
    };  
}

class reverse{
    int n;
    void getdata(int i){
        n=i;
    }
    void processdata(){
        int rev=0;
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        };
        System.out.println("Reverse: "+rev);
    }
}