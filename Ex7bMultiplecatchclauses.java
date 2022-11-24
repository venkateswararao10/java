import java.lang.*;
import java.util.*;
import java.io.*;
public class Ex7bMultiplecatchclauses {
     static void div(int e,int f){
        int c=e/f;
        System.out.println("the value of a/b is "+c);
    }
    public static void main(String[] args){
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("enter a and b value");
            int a=sc.nextInt();
            int b=sc.nextInt();
            Scanner scan = new Scanner(System.in);   
            System.out.println("enter string value:");
            String s=scan.nextLine();
            int n = Integer.parseInt(s);
            if (99%n == 0){
                System.out.println(n + " is a factor of 99");}
            Ex7bMultiplecatchclauses.div(a,b);
        }
        catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch (Exception e){
              System.out.println("parent exception: "+e);
    }
}
}