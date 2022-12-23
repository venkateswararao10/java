 class thread1 extends Thread {
    public void run(){
        try{
            sleep(1000);
        System.out.println("good morning");}
        catch(Exception e){
        System.out.println(e);
        }

    }
}
 class thread2 extends Thread {
    public void run(){
        try{
            sleep(1000);
        System.out.println("hello");}
        catch(Exception e){
        System.out.println(e);
        }

    }
}
 class thread3 extends Thread {
    public void run(){
        try{
            sleep(1000);
        System.out.println("welcome");}
        catch(Exception e){
        System.out.println(e);
        }

    }
}
  class thread4 implements Runnable{
    public void run(){
        try{
            Thread.sleep(1000);
        System.out.println("good morning");}
        catch(Exception e){
        System.out.println(e);
        }

    }
  }
  class thread5 implements Runnable{
    public void run(){
        try{
            Thread.sleep(2000);
        System.out.println("hello");}
        catch(Exception e){
        System.out.println(e);
        }

    }
  }
  class thread6 implements Runnable{
    public void run(){
        try{
            Thread.sleep(3000);
        System.out.println("welcome");}
        catch(Exception e){
        System.out.println(e);
        }

    }
  }
public class Ex10aThreads  {
    public static void main(String[] args){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3 = new thread3();
        t1.start();
        t2.start();
        t3.start();
        thread4 t4=new thread4();
        thread5 t5=new thread5();
        thread6 t6=new thread6();
        Thread a=new Thread(t4);
        Thread b=new Thread(t5);
        Thread c=new Thread(t6);
        a.start();
        b.start();
        c.start();
    }
}
