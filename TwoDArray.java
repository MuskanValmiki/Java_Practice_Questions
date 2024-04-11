import java.util.Scanner;

public class TwoDArray{
    public static void main(String args[]){
        twodim aa=new twodim();
        aa.getdata();
        aa.putdata();
    }
}

class twodim{
    int a[][]=new int [3][3];
    void getdata(){
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter no:");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void putdata(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
    }
}