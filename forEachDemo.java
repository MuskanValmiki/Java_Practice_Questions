import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;;

public class forEachDemo {
    public static void main(String arg[]){
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        nums.forEach(n->System.out.println(n));
        
        // Consumer<Integer> con=n->System.out.println(n);
        
        // Consumer<Integer> con=new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        // nums.forEach(con);
        
        // nums.forEach(n->System.out.println(n));

    }
};
