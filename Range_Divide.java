//Write a Java program to find the number of values in a given range divisible by a given value.

public class Range_Divide {
    public static void main(String arg[]){
        int x = 5;
		int y = 20;
		int p = 3;
		System.out.println(result(x,y,p));
    };
    public static int result(int x, int y, int p) {	
		if (x%p == 0)
			return( y/p - x/p + 1);
		return(y/p - x/p);
	};
};
