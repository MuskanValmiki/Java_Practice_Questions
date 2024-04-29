public class Practice8 {
    public static void main(String args[]){
        A aa=new A();
        B bb=new B();
        C cc=new C();
        cc.setPriority(Thread.MAX_PRIORITY);
        bb.setPriority(aa.getPriority()+1);
        aa.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread A Started...");
        aa.start();
        System.out.println("Thread B Started...");
        bb.start();
        System.out.println("Thread C Started...");
        cc.start();
        System.out.println("Main Thread Ended...");
    }
}

class A extends Thread{
    public void run(){
        System.out.println("Thread A Started");
        for(int i=1;i<=5;i++){
            System.out.println("From Thread A:i="+i);
        }
        System.out.println("Thread A Ends Here...");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("Thread B Started");
        for(int j=1;j<=5;j++){
            System.out.println("From Thread B:j="+j);
        }
        System.out.println("Thread B Ends Here...");
    }
}

class C extends Thread{
    public void run(){
        System.out.println("Thread C Started");
        for(int k=1;k<=5;k++){
            System.out.println("From Thread C:k="+k);
        }
        System.out.println("Thread C Ends Here...");
    }
}

//getPriority() and setPriority() in mumltithreading .