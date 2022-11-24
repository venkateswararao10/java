class shape{
void draw(){
    System.out.println("this is parent shape");
}
}
class rectangle extends shape{
    void draw() {
        System.out.println("this is rectangle shape");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("this is circle shape");
    }
}
class triangle extends shape{
        void draw(){
            System.out.println("this is triangle shape");
        }
}
class Ex8aRuntimepolymorphism {
    public static void main(String args[]){
        shape s=new rectangle();
        s.draw();
        shape t=new triangle();
        t.draw();
        circle c=new circle();
        c.draw(); 
    }
}
