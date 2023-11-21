import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MFRSorted {
    public static void main(String arg[]){
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        int result=nums.stream()
            .filter(n->n%2==0)
            .map(n->n*2)
            .reduce(0,(c,e)->c+e);
        
            System.out.println(result);
    };
};
