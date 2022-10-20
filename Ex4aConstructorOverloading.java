public class Ex4aConstructorOverloading {
    double x;
    double y;
    Ex4aConstructorOverloading(){
        System.out.println(x);
        System.out.println(y);
    }
    Ex4aConstructorOverloading(int a,int b){
                 x=a;
                 y=b;
       System.out.println(x);
       System.out.println(y);
    }
    Ex4aConstructorOverloading(double c){
                 x=c;
                 y=999;
        System.out.println(x);
        System.out.println(y);
    }
    Ex4aConstructorOverloading(double d,double e){
                 x=d;
                 y=e;
       System.out.println(x);
       System.out.println(y);
    }
    public static void main(String[] args) {
         Ex4aConstructorOverloading con1=new Ex4aConstructorOverloading();
         Ex4aConstructorOverloading con2=new Ex4aConstructorOverloading(4,5);
         Ex4aConstructorOverloading con3=new Ex4aConstructorOverloading(6);
         Ex4aConstructorOverloading con4=new Ex4aConstructorOverloading(4.5,5);
    }
}
