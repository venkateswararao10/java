import java.util.Scanner;
public class Ex9cBuiltInException {
    public static void main(String args[]){
        try{
Scanner sc= new Scanner(System.in);
System.out.println("enter a and b value");
int a=sc.nextInt();
int b=sc.nextInt();
int c=a/b;
System.out.println("the value of a/b is"+c);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
finally{
    System.out.println("finally we executed this code");
}
    }
}
