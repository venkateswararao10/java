import java.util.Scanner;
public class Ex1cFindQualifyingSpeedOfARacer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int speed[]=new int[size];
        for (int i=0;i<size;i++){
            speed[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<size;i++){
            sum+=speed[i];
        }
        double avgspeed=(sum/5);
        for (int i=0;i<size;i++){
            if (speed[i]>avgspeed){
                System.out.println("this is raider "+i+" qualifying speed of "+speed[i]);
            }
        }
        sc.close();
    }
}
