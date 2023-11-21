public class ExceptionThrow {
    public static void main(String arg[]){
        int i=0;
        int j=0;
        int nums[]=new int[5];
        try
        {
            j=18/i;
            if(j==0)
               throw new ArithmeticException("I don't want to print zero.");
            // System.out.println(nums[1]);
            // System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            j=18/1;
            // System.out.println("cannot divide by zero");
            System.out.println("that the default output");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in you limit.");
        }
        catch(Exception e){
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("Bye");
    };
};