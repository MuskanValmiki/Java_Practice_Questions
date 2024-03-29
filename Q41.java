public class Q41 {
    public static void main(String args[]){
        // int i=0;
        // while(i<=10){
        //     i=i+1;
        //     System.out.println(i);
        //     if(i==5){
        //         break;
        //     };
        // };
        // System.out.println("Execution done");
        int j=0;
        while(j<=10){
            j=j+1;
            if(j==5){
                continue;
            };
            System.out.println(j);
        };
        System.out.println("Execution done");
    }
}
