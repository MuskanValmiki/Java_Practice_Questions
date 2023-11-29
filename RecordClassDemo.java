import java.util.Objects;

// class Musu{
//     private final int id;
//     private final String name;

//     public Musu(int id, String name){
//         this.id=id;
//         this.name=name;
//     };

//     public int getId(){
//         return id;
//     };

//     public String getName(){
//         return name;
//     };

//     public boolean equals(Object o){
//         if(this==o) return true;
//         if(o==null || getClass() != o.getClass()) return false;
//         Musu musu =(Musu) o;
//         return id==musu.id && Objects.equals(name, musu.name);
//     };

//     public int hashCode(){
//         return Objects.hash(id, name);
//     };

//     public String toString(){
//         return "Musu{"+"id"+id+" , name='"+name+'}';
//     };
// };

// record Musu(int id, String name) { }

// public class RecordClassDemo {
//     public static void main(String arg[]){
//         Musu a1=new Musu(1,"Muskan");
//         Musu a2=new Musu(1,"Muskan");
//         System.out.println(a1.equals(a2));
//     };
// };
