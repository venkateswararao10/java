 class Ex3bConstructor {
    int x;

    Ex3bConstructor(){
        System.out.println("non arg constructor calling");
        System.out.println(x);
    }
    Ex3bConstructor(int a ){
        System.out.println("parameterized constructor calling");
        x=a;
        System.out.println(x);
    }
 public static void main(String[] args){
    Ex3bConstructor ex3b = new Ex3bConstructor();
    Ex3bConstructor con = new Ex3bConstructor(5);
 }
}
