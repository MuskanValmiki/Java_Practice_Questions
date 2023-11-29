import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.function.*;
public class MFRSorted {
    public static void main(String arg[]){
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        // Predicate <Integer> p= n->n%2==0;
        // Predicate<Integer> p=new Predicate<Integer>(){
        //     public boolean test(Integer){
        //         return n%2==0;
        //         // if(n%2==0)
        //         //     return true;
        //         // else
        //         //     return falise
        //     }
        // }

        // Function<Integer, Integer> fun=new Function<Integer, Integer>(){
            // public Integer apply(Integer n){
        //         return n*2;
        //     };
        // };

        // Function <Integer, Integer> fun=n->n*2;

        // int result=nums.stream()
        // Stream<Integer> sortedValues =nums.stream()
        Stream<Integer> sortedValues=nums.parallelStream()
            .filter(n->n%2==0)
            .sorted();
            // .map(n->n*2)
            // .reduce(0,(c,e)->c+e);
        
        sortedValues.forEach(n->System.out.println(n));
    };
};
