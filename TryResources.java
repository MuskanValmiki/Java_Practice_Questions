// import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TryResources {
    public static void main(String arg[]) throws NumberFormatException,IOException {
        // int i=0;
        // int j=0;
        int num=0;
        // BufferedReader br=null;
        try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))){
            // j=18/i;
            // System.out.println("Bye");
            // InputStreamReader in=new InputStreamReader(System.in);
            // BufferedReader br=new BufferedReader(in);
            // num=Integer.parseInt(br.readLine());
            // System.out.println(num);
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        };
        // catch(Exception e){
        //     System.out.println("Something went wrong.");
        // }
        // finally{
            // br.close();
            // System.out.println("Bye");
        // }
    };
};
