import java.util.Scanner;
class linear{
    int a[]=new int[10];
    int key;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<10;i++){
            System.out.println("Enter no=");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter no to search=");
        key=sc.nextInt();
    }
    void search(){
        int i;
        int flag=0;
        for(i=0;i<10 && flag==0;i++){
            if(a[i]==key){
                flag=1;
                i=i+1;
            }
        }
        if(flag==1){
            System.out.println("No. found"+i);
        }else{
            System.out.println("No. not found");
        }
    }
    
}
public class LinearSearch {
    public static void main(String args[]){
        linear aa=new linear();
        aa.getdata();
        aa.search();
    }
}
