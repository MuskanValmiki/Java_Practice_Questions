import java.util.Scanner;

public class Q46 {
    // int n;
    // void getdata(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     n=sc.nextInt();
    // }
    // void processdata(){
    //     int i,count=0;
    //     for(i=1;i<=n;i++){
    //         if(n%i==0){
    //             count+=1;
    //         }
    //     }
    //     if(count==2){
    //         System.out.println("It is prime");
    //     }else{
    //         System.out.println("It is not prime");
    //     }
    // }
    public static void main(String args[]){
        prime aa=new prime();
        aa.getdata();
        aa.processdata();
    };
}

class prime{
    int n;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n=sc.nextInt();
    }
    void processdata(){
        int i,count=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("It is prime");
        }else{
            System.out.println("It is not prime");
        }
    }
}