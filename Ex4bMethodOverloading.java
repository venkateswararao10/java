import java.lang.*;
import java.util.*;
import java.io.*;
class Ex4bMethodOverloading{
    static double a,b;
    static void method(){
       a=0;
       b=0;
       System.out.println("value of a is "+a+" value of b is "+b);
    }
    static void method(int c,int d){
        a=c;
        b=d;
       System.out.println("value of a is "+a+" value of b is "+b);
    }
    static void method(double e,double f){
        a=e;
        b=f;
        System.out.println("value of a is "+a+" value of b is "+b);
    } 
    static void method(double t){
        a=t;
        b=0;
        System.out.println("value of a is "+a+" value of b is "+b);
    }
    public static void main(String args[]){
         method();
         method(2,3);
         method(2.2,4.3);
         method(3.4);
    }
}