import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        selectionsort aa=new selectionsort();
        aa.getdata();
        System.out.println("unsorted array");
        aa.putdata();
        System.out.println("sorted array");
        aa.sort();
        aa.putdata();
    }
}

class selectionsort{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[sc.nextInt()];
    void getdata(){
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<a.length;i++){
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
        int i,j,t;
        for(i=0;i<(a.length-1);i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
}