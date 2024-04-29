import javafx.scene.layout.Priority;

public class Practice9 {
    public static void main(String args[]){
        A aa=new A();
        B bb=new B();
        C cc=new C();
        aa.setPriority(Thread.MIN_PRIORITY);
        bb.setPriority(Thread.NORM_PRIORITY);
        cc.setPriority(Thread.MAX_PRIORITY);
        System.out.println("\nInside Main Thread and its ID is:"+Thread.currentThread().getId()+"\nMain Thread Priority="+Thread.currentThread().getPriority());
        System.out.println("\nNow colling other threads Thread A->Thread B->Thread C");
        aa.start();
        bb.start();
        cc.start();
    }
}

class A extends Thread{
    public void run(){
        System.out.println("\n Inside Thread A: \nThread ID:\t"+Thread.currentThread().getId()+"\nThread Priority:\t"+Thread.currentThread().getPriority());
    }
}

class B extends Thread{
    public void run(){
        System.out.println("\n Inside Thread B: \nThread ID:\t"+Thread.currentThread().getId()+"\nThread Priority:\t"+Thread.currentThread().getPriority());
    }
}

class C extends Thread{
    public void run(){
        System.out.println("\n Inside Thread C: \nThread ID:\t"+Thread.currentThread().getId()+"\nThread Priority:\t"+Thread.currentThread().getPriority());
    }
}

//setPriority(),getPriority(),getID() and currentThread() method in multithreading.
