import java.io.IOException;
import java.util.Scanner;
// import java.io.InputStreamReader;
// import java.io.BufferedReader;

public class InputBufferReader {
   public static void main(String arg[]) throws IOException{
    System.out.println("Enter a number");
    // int num=System.in.read();
    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader bf=new BufferedReader(in);

    // int num=Integer.parseInt(bf.readLine());
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println(num);
    // bf.close();
    // System.out.println(num);
   }; 
};
