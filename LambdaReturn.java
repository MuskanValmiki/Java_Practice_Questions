interface A{
    int add(int i,int j);
};

public class LambdaReturn {
    public static void main(String arg[]){
        A obj=(i,j) -> i+j;
        // A obj=new A(){
        //     public int add(int i,int j){
        //         return i+j;
        //     };
        // };
        int result=obj.add(5,8);
        System.out.println(result);
    };
};
