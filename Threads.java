// class Z{

// };

// class A implements Runnable{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("hii");
//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){
//                 e.printStackTrace();
//             };
//         };
//     };
// };

// class B implements Runnable{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("hello");
//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){ e.printStackTrace();}
//         };
//     };
// };

// public class Threads {
//     public static void main(String arg[]){
//         Runnable obj1=new A();
//         Runnable obj2=new B();
//         // obj2.getPriority(Thread.MAX_PRIORITY);
//         Thread t1=new Thread(obj1);
//         Thread t2=new Thread(obj2);
//         t1.start();
//         // try {
//         //     Thread.sleep(2);
//         // }catch(InterruptedException e){ e.printStackTrace();}
//         t2.start();
//     };
// };


public class Threads{
    public static void main(String arg[]){
        Runnable obj1= () ->{
            for(int i=1;i<=5;i++){
                System.out.println("hii");
                try{Thread.sleep(10);}catch(InterruptedException e){e.printStackTrace();}
            }
        };
        Runnable obj2= () ->{
            for(int i=1;i<=5;i++){
                System.out.println("hello");
                try{Thread.sleep(10);}catch(InterruptedException e){e.printStackTrace();}
            }
        };
        
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}