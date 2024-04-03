import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        binary_search aa=new binary_search();
        aa.getdata();
        aa.search();
    }
}

class binary_search{
    int a[]=new int[10];
    int key;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
            System.out.println("Enter no=");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter no.to search=");
        key=sc.nextInt();
    }
    void search(){
        int i;
        int j;
        int mid;
        int flag;
        int pos;
        i=0;
        j=9;
        flag=0;
        pos=0;
        while(i<=j && flag==0){
            mid=(i+j)/2;
            if(a[mid]==key){
                flag=1;
                pos=mid+1;
            }
            if(a[mid]>key){
                j=mid-1;
            }
            if(a[mid]<key){
                i=mid+1;
            }
        }
        if(flag==0){
            System.out.println("not found");
        }else{
            System.out.println("found "+pos);
        }
    }
}