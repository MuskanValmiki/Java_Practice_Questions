public class ExceptionHandling {
    public static void main(String arg[]){
        int i=2;
        int j=0;
        int nums[]=new int[5];
        try
        {
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
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
