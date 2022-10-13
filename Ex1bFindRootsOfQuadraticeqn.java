import java.util.Scanner;
public class Ex1bFindRootsOfQuadraticeqn {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a,b,c: ");
double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
double d=b*b-4*a*c;
double r1,r2;
        if(d<0){
            System.out.println("No solutions");
            System.out.println("roots are imaginary");}
        else if(d==0){
r1=r2=-b/(2*a);
System.out.println("roots are equal and real and root1 = "+r1+" root2 = "+r2);
        }
else if(d>0){
    r1=-b+Math.sqrt(a)/(2*a);
    r2=-b-Math.sqrt(a)/(2*a);
    System.out.println("roots are real and distinct and root1 = "+r1+" root2 = "+r2);
}
sc.close();
    }
}
