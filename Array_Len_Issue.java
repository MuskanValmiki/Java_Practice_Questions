//Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2.

public class Array_Len_Issue {
    public static void main(String arg[]){
        int [] array1 = {50, -20, 0, 30, 40, 60, 12};
        int [] array2= {45, 20, 10, 20, 30, 50, 11};
        // int [] array2={50,20,10,20,30,50,12};
        if (array1.length>=2 && array2.length>=2){
            if(array1[0]==array2[0] && array1[array1.length - 1] == array2[array2.length - 1]){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            };
        };
    };
};
