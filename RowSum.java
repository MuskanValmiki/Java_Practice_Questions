import java.util.Scanner;

public class RowSum {
    public static void main(String args[]){
        rowsum aa=new rowsum();
        aa.getdata();
        aa.putdata();
        aa.rowsum();
    }
}

class rowsum{
    Scanner sc=new Scanner(System.in);
    int a[][]=new int [3][3];
    int i,j;
    void getdata(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter no:");
                a[i][j]=sc.nextInt();
            }
        }
    }

    void putdata(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println(a[i][j]+"    ");
            }
            System.out.println();
        }
    }

    void rowsum(){
        int sum=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                sum=sum+a[i][j];
            }
            System.out.println("sum "+sum);
        }
    }
}