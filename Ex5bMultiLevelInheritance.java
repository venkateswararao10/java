class A{
   public  void printa(){
        System.out.println("this is class A");
    }
    protected void printai(){
        System.out.println("this is class A 1");
    }
    private void printaio(){
        System.out.println("this is class A 2");
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
   //c1.printaio();//error this is private method in class A
   //c1.printc();//error  private method can't access outside class
   c1.printb();
   c1.printai();
   c1.printa();
}}