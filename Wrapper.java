public class Wrapper {
    public static void main(String arg[]){
        int num=7;
        // Integer num1=new Integer(8);//wrapper
        Integer num1=num;//autoboxing
        int num2=num1;//auto-unboxing
        //Integer num1=new Integer(num) its boxing.
        System.out.println(num2);
        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3*2);
    };
};
