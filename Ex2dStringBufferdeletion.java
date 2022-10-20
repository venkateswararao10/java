public class Ex2dStringBufferdeletion {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer();
        // delete all contents
        sb.append("hello world");
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println(sb);
        //delete specific range elements
        sb.append("good morning");
        System.out.println(sb);
        sb.delete(2, 5);
        System.out.println(sb);
        // delete particular character
        StringBuffer sb1=new StringBuffer();
        sb1.insert(0, "good day");
        System.out.println(sb1);
        sb1.deleteCharAt(6);
        System.out.println(sb1);
    }
}
