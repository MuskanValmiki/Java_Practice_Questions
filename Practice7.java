public class Practice7 {
    public static void main(String args[]){
        A thread1=new A();
        B thread2=new B();
        C thread3=new C();
        System.out.print("Thread a is being started...");
        thread1.start();
        System.out.print("Thread b is being started...");
        thread2.start();
        System.out.print("Thread c is being started...");
        thread3.start();
    }
}

class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            if(i==1)
            yield();
            System.out.println("\n From Thread a:i="+i);
        }
        System.out.println("End of Thread a");
    }
}

class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("\n From Thread b:j="+j);
            if(j==3)
            stop();
        }
        System.out.println("End of Thread b");
    }
}

class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("\n From Thread c:k="+k);
            if(k==1)
            try{
                sleep(1000);
            }catch(Exception e){

            }
        }
        System.out.println("End of Thread c");
    }
}

//thread life cycle in multithreading .
