import java.util.*;

public class Practice3 {
    public static void main(String args[]){
        Vector list=new Vector();
        list.addElement("Somi");
        list.addElement("Samriddhi");
        list.addElement("Muskan");
        list.addElement("coder");
        System.out.println("vector elements="+list);
        list.insertElementAt("Ujefa", 1);
        System.out.println("vector after insurting coder"+list);
        System.out.println("size of list="+list.size());
        list.removeElement("coder");
        System.out.println("vectore after removering coder"+list);
        list.removeElementAt(1);
        System.out.println("after remove index of element"+list);
        list.removeAllElements();
        System.out.println("remove all elements"+list);
    }
}

//vector functions.