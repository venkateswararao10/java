interface shape{
    void area();
    double pi=3.14;
}
class circle implements shape{
double r;
circle(double r){
    this.r=r;
}
public void area()
{
    System.out.println("the area of the circle is "+pi*r*r);
}
}
class Ex6binterface{
    public static void main(String[] args){
        circle c=new circle(10);
        c.area();
    }
}
