import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        bubblesort aa=new bubblesort();
        aa.getdata();
        System.out.println("Unsorted array");
        aa.putdata();
        System.out.println("Sorted array");
        aa.sort();
        aa.putdata();
    }
}

class bubblesort{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[sc.nextInt()];
    void getdata(){
        int i;
        for(i=0;i<a.length;i++){
            System.out.println("Enter no:");
            a[i]=sc.nextInt();
        }
    }
    void putdata(){
        int i;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    void sort(){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}