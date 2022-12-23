class thread1 extends Thread {
    public void run(){
        try{
            for (int i = 0; i <5;i++){
            sleep(1000);
        System.out.println("good morning");}}
        catch(Exception e){
        System.out.println(e);
        }

    }
}
 class thread2 extends Thread {
    public void run(){
        try{
            for (int i = 0; i <5;i++){
            sleep(1000);
        System.out.println("hello");}}
        catch(Exception e){
        System.out.println(e);
        }

    }
}
 class thread3 extends Thread {
    public void run(){
        try{
            for (int i = 0; i <5;i++){
            sleep(1000);
        System.out.println("welcome");}}
        catch(Exception e){
        System.out.println(e);
        }

    }
}
public class Ex10bisAliveandjoin {
    public static void main(String[] args){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3 = new thread3();
        t1.start();
        System.out.println(t1.isAlive());
        try{
            t1.join();
           
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(t2.isAlive());
        t2.start();
        try{
            t2.join();
    
        }
        catch(Exception e){
            System.out.println(e);
        }
        t3.start();
        System.out.println(t3.isAlive());
        try{
          
          
            t3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
       
       
      
       
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());
    
    
    }
}
