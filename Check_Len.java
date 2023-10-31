// Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.

public class Check_Len {
    public static void main(String arg[]){
        int [] arr={5,7};
        if(arr[0]==4 || arr[0]==7){
            System.out.println(true);
        }else{
            System.out.println(arr[1]==4 || arr[1]==7);
        };
    };
};
