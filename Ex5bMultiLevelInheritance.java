class A{
   public  void printa(){
        System.out.println("this is class A");
    }
    protected void printa1(){
        System.out.println("this is class A 1");
    }
    private void printa2(){
        System.out.println("this is class A 2");
    }
    void printa3(){
        System.out.println(" this is class A 3");
    }
}
class B extends A{
   protected void printb(){
   System.out.println("this is class B");
}
}
class C extends B{
  private void printc(){
        System.out.println("this is class C");
    }
}

class Ex5bMultiLevelInheritance{
    public static void main(String[] args){
   C c1=new C();
   //c1.printa2();//error this is private method in class A
   //c1.printc();//error  private method can't access outside class
   c1.printb();
   c1.printa1();
   c1.printa();
   c1.printa3();
}}