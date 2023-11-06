// import java.util.*;

public class StringBufferDemo {
    public static void main(String arg[]){
        StringBuffer name=new StringBuffer("Mussu");
        System.out.println(name.capacity());
        System.out.println(name.length());
        //here I add the data
        name.append(" Valmikee");
        System.out.println(name);
        //delete the char in string
        name.deleteCharAt(0);
        System.out.println(name);
        name.insert(0, "M");
        System.out.println(name);
        name.hashCode();
        System.out.println(name+" 17Feb");
        name.substring(5);
        System.out.println(name);
    };
};
