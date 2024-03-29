import java.util.Scanner;

public class Q42 {
    public static void main(String args[]){
        Practice data=new Practice();
        int choice;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("1->Sum of Digits\n 2->Product of Digits\n 3->Reverse of Digits \n 4->Check Palindrome \n 5->Find Factorial \n  6->Find Fabinacci Series \n 7->Check Prime Number \n 8->Exit \n Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                data.getdata();
                data.sumOfdigits();
                break;
                case 2:
                data.getdata();
                data.prodofdigits();
                break;
                case 3:
                data.getdata();
                data.reverse();
                break;
                case 4:
                data.getdata();
                data.palindrome();
                break;
                case 5:
                data.getdata();
                data.factorial();
                case 6:
                data.getdata();
                data.Fabinacci();
                break;
                case 7:
                data.getdata();
                data.prime();
                break;
                case 8:
                break;
                default:
                System.out.println("Invalid Choice");
                break;
            };
        }while(choice!=8);
    }
}
class Practice{
    int i;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        i=sc.nextInt();
    }
    void sumOfdigits(){
        int sum=0;
        while(i>0){
            sum=sum+(i%10);
            i=i/10;
        }
        System.out.println("Sum of digits= "+sum);
    }
    void prodofdigits(){
        int pro=1;
        while(i>0){
            pro=pro*(i%10);
            i=i/10;
        }
        System.out.println("Product of digits= "+pro);
    }
    void reverse(){
        int rev=0;
        while(i>0){
            rev=rev*10+(i%10);
            i=i/10;
        }
        System.out.println("Reverse of number= "+rev);
    }
    void palindrome(){
        int x,rev=0;
        x=i;
        while(x>0){
            rev=rev*10+(x%10);
            x=x/10;
        }
        if(rev==i){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
    void factorial(){
       int fact=1;
       while(i>0){
        fact=fact*i;
        i-=1;
       }
       System.out.println("Factorial is "+fact);
    }
    void Fabinacci(){
        int x,y,z;
        x=0;
        y=1;
        z=0;
        while(z<=i){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
    void prime(){
        int x,count=0;
        for(x=1;x<=i;x++){
            if(i%x==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
