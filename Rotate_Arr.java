// Write a Java program to rotate an array (length 3) of integers in the left direction.

import java.util.Arrays;

public class Rotate_Arr {
    public static void main(String arg[]){
        int [] arr={20, 30, 40};
        int [] rotate={arr[1],arr[2],arr[0]};
        System.out.println(Arrays.toString(rotate));
    };
};
