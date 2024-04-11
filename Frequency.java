import java.util.Scanner;

public class Frequency {
    public static void main(String args[]){
        frequency aa=new frequency();
        aa.getdata();
        aa.count();
    }
}

class frequency{
    int a[]=new int[10];
    int key;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter no:");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter no of find frequency:");
        key=sc.nextInt();
    }
    void count(){
        int i;
        int count=0;
        for(i=0;i<a.length;i++){
            if(a[i]==key){
                count=count+1;
            };
        };
        System.out.println("Frequency of key:"+count);
    }
}