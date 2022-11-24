public class Ex9athrowexception {
     static void throwException(){
        throw new RuntimeException("demo exception");
    }
    public static void main(String[] args) {
        try{
            throwException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
}}
