import java.util.Scanner;

public class Multi {
    public static void main(String args[]){
        multi aa=new multi();
        aa.getdata();
        aa.putdata();
        aa.multi();
    }
}

class multi{
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    int i,j;
    void getdata(){
        System.out.println("enter element for matrix a:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter no");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter element for matrix b:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter no");
                b[i][j]=sc.nextInt();
            }
        }
    }

    void putdata(){
        System.out.println("first matrix is ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("second matrix is ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(b[i][j]+"    ");
            }
            System.out.println();
        }
    }

    void multi(){
        int k;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=0;
                for(k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]+b[k][j];
                }
            }
        }
        System.out.println("multiply of matrix.");
                for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                        System.out.print(c[i][j]+"    ");
                    }
                    System.out.println();
                }
    }
}