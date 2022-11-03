class base{
    int a;
    base(){
        a=5;
    }
    base(int x){
        a=x;
    }
}
class child extends base{
  child(){}
    child(int z){
        super(z); //super(z) must be first statement in constructor
  }
    void printsuperclassvar(){
        System.out.println("the val of super class variable is " + super.a);
    }
}


public class Ex6aSuperkeyword {
    public static void main(String args[]){
    child ch=new child();
    ch.printsuperclassvar();
    child c=new child(100);
    c.printsuperclassvar();
}}
