import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String arg[]){
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        System.out.println(nums.indexOf(5));
        System.out.println(nums.get(2));
        // for(object n:nums){
        //     int num=(Integer) n;
        //     System.out.println(num*2);
        // };
    };
};
