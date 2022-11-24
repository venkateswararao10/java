import java.util.*;
public class Ex9bfinallyException {
    public static void main(String args[]){
        try{
Scanner sc= new Scanner(System.in);
System.out.println("enter a and b value");
int a=sc.nextInt();
int b=sc.nextInt();
int c=a/b;
System.out.println("the value of a/b is"+c);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
finally{
    System.out.println("finally i will execute always");
}
System.out.println("i want to run this code");
    }
}
