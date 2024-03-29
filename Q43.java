import java.util.Scanner;

public class Q43 {
    public static void main(String args[]){
        // int [] a={1,4,6,1,8,7,0,1};
        // int count=0;
        // int i;
        // for(i=0;i<a.length;i++){
        //     if(a[i]==1){
        //         count++;
        //     }
        // }
        // System.out.println(count);
        
        // for(int i=1;i<=3;i++){
        //     for(int j=1;j<=3;j++){
        //         System.out.println(j);
        //     }
        // }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row=sc.nextInt();
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+i);
        //     }
        //     System.out.println();
        // }

        // for(;row>=1;row--){
        //     for(int j=1;j<=row;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(;row>=1;row--){
        //     for(int j=1;j<=row;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(;row>=1;row--){
        //     for(int j=1;j<=row;j++){
        //         System.out.print(row);
        //     }
        //     System.out.println();
        // }
         
        // int k=1;
        // for(;row>=1;row--){
        //     for(int j=1;j<=row;j++){
        //         System.out.print(k);
        //     }
        //     k+=1;
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int s=1;s<=row-i;s++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int s=1;s<=row-i;s++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int s=1;s<=row-i;s++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int s=1;s<=row-i;s++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=row+1-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=row+1-i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // int k=1;
        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=row+1-i;j++){
        //         System.out.print(k);
        //     }
        //     k+=1;
        //     System.out.println();
        // }

        // int m=5;
        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=row+1-i;j++){
        //         System.out.print(m);
        //     }
        //     m-=1;
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<=row-i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<=row-i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<=row-i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*(row-i)+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*(row-i)+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*(row-i)+1;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*(row-i)+1;j++){
        //         System.out.print(row-i+1);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<=row-i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // row=row-1;
        // for(int i=1;i<=row;i++){
        //     for(int b=1;b<=i;b++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*(row-i)+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=row;i++){
            for(int b=1;b<=row-i;b++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        row=row-1;
        for(int i=1;i<=row;i++){
            for(int b=1;b<=i;b++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(row-i)+1;j++){
                System.out.print(row+1-i);
            }
            System.out.println();
        }
    }
}
