import java.util.Scanner;

public class Transpose {
    public static void main(String args[]){
        demo aa=new demo();
        aa.getdata();
        System.out.println("original matrix");
        aa.putdata();
        aa.transpose();
    }
}

class demo{
    int a[][]=new int [3][3];
    int b[][]=new int [3][3];
    int i,j;
    void getdata(){
        Scanner sc=new Scanner (System.in);
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
                System.out.print(a[i][j]+"     ");
            }
            System.out.println();
        }
    }

    void transpose(){
        // System.out.println("Transpose is ");
        // for(i=0;i<3;i++){
        //     for(j=0;j<3;j++){
        //         System.out.print(a[j][i]+"   ");
        //     }
        //     System.out.println();
        // }

        // for(i=0;i<3;i++){
        //     for(j=0;j<3;j++){
        //         b[i][j]=a[j][i];
        //     }
        // }
        // System.out.println("Transpose is");
        // for(i=0;i<3;i++){
        //     for(j=0;j<3;j++){
        //         System.out.print(b[i][j]+"    ");
        //     }
        //     System.out.println();
        // }
        
        int t;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(j>i){
                    t=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=t;
                }
            }
        }
        System.out.println("Transpose is");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
    }
}