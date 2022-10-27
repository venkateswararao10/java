 
    class Parent{
        int a=5;
        int b=10;
        void printelepar(){
            System.out.println(a);
            System.out.println(b);
        }
    }
    class Child extends Parent{
        int c=15;
        void printelechild(){
            System.out.println(c);
        }}
        class Ex5aSingleInheritance{
    public static void main(String[] args){
        Child ch=new Child();
        ch.printelepar();
        ch.printelechild();
    }
}

  /*    class Ex5aSingleInheritance extends Child{
    public static void main(String[] args){
        Ex5aSingleInheritance ch=new Ex5aSingleInheritance();
        ch.printelepar();
        ch.printelechild();
    }
}*/ //this code also works

