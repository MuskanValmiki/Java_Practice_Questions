//Write a Java program to create an array of length 2 from two integer arrays with three elements. 
//The newly created array will contain the first and last elements from the two arrays.

import java.util.*;

public class New_Array {
    public static void main(String arg[]){
        int [] array1={50, -20, 0};
        int [] array2={5, -50, 10};
        int [] new_array={array1[0],array2[2]};
        System.out.println(Arrays.toString(new_array));
    };
};
