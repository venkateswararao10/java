public class Ex3aimplementclassmechanism {
    static void method(){
        System.out.println("method");
  }
    void metd(){
        System.out.println("metd");
    }
    public static void main(String[] args){
        method(); //or Ex3aimplementclassmechanism.method();
        Ex3aimplementclassmechanism cla= new Ex3aimplementclassmechanism();
        cla.metd();
    }
}
