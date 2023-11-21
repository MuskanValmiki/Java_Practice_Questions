class MuskanException extends Exception{
    public MuskanException(String string){
        super(string);
    };
};

public class CustomException {
    public static void main(String arg[]){
        int i=20;
        int j=0;
        try
        {
            j=18/i;
            if(j==0)
               throw new MuskanException("I don't want to print zero.");
        }
        catch(MuskanException e){
            j=18/1;
            System.out.println("that the default output "+e);
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
