//Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.

public class Max_Arr {
    public static void main(String arg[]){
        int [] arr={20, 30, 40};
        int i=0;
        int max=0;
        while (i<arr.length){
            if(arr[i]>max){
                max=arr[i];
            };
            i++;
        };
        System.out.println("largest value of array in first to last:- "+max);
    };
};
