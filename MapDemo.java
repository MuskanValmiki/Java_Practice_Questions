import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String arg[]){
        Map<String,Integer> students=new HashMap();

        students.put("Muskan",56);
        students.put("Samridhi",23);
        students.put("Somi",57);
        students.put("Coder",45);
        students.put("Muskan",92);

        // System.out.println(students.keySet());

        for(String key:students.keySet()){
            System.out.println(key+" : "+students.get(key));
        };
    };
};
