//Write a Java program to test if 10 appears as the first or last element of an array of integers.
//  The array length must be broader than or equal to 2.

public class Multi_Two {
    public static void main(String[] args) {
        // Define an integer array
        int[] num_array = {10, -20, 0, 30, 40, 60, 10};
        
        // Check if the first or last element of the array is equal to 10
        boolean result = (num_array[0] == 10 || num_array[num_array.length - 1] == 10);

        // Print the result
        System.out.println(result);
    };
};
