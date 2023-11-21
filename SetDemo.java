// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String arg[]){
        // Set<Integer> nums=new HashSet<Integer>(); 
        //without sorting element we got just remove duplicate
        Set<Integer> nums=new TreeSet<Integer>();
        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        nums.add(61);

        Iterator<Integer> values=nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());
        // for(int n:nums){
        //     System.out.println(n);
        // };
    };
};
