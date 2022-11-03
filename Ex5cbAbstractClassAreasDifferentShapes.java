abstract class Shape {
    int l,b;
    Shape(int x,int y){
        l=x;
        b=y;
    }
    abstract void area();
}

class Rectangle extends Shape{
       Rectangle(int a,int b){
        super(a,b);
       }
        void area(){
          System.out.println("the area of the rectangle is "+l*b);
        }
    }

class Square extends Shape{
    Square(int a){    
    super(a,a);}
        void area(){        
          System.out.println("the area of the square is "+l*b);
        }
    }

class Ex5cAbstractClassAreasDifferentShapes {
    public static void main(String[] args) {
        Shape Sh = new Rectangle(6,8);
        Sh.area();
        Square s = new Square(6);
        s.area();
    }
}
