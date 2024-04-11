import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]){
        insertionsort aa=new insertionsort();
        aa.getdata();
        System.out.println("unsorted array");
        aa.putdata();
        aa.sort();
        System.out.println("sorted array");
        aa.putdata();
    }
}
class insertionsort{
    Scanner sc=new Scanner(System.in);
    int a[]=new int [sc.nextInt()];
    void getdata(){
        for (int i=0;i<a.length;i++){
            System.out.println("Enter no:");
            a[i]=sc.nextInt();
        }
    }

    void putdata(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    void sort(){
        int i,j,val;
        for(i=1;i<a.length;i++){
            val=a[i];
            j=i-1;
            while(val<a[j]){
                a[j+1]=a[j];
                j--;
                if(j==-1){
                    break;
                }
            }
            a[j+1]=val;
        }
    }
}