public class Q36 {
    public static void main(String args[]){
        int i;
        int total=0;
        for(i=1;i<=100;i++){
            int factor=0;
            int j;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    factor+=1;
                }
            }
            if(factor==2){
                System.out.println("Prime number: "+i);
                total+=1;
            }
        }
        System.out.println("total prime: "+total);
    }
}
