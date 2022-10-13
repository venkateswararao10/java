import java.util.Scanner;
public class BubbleSorting {
    void bubbleSort(int arr1[],int size1) {

        for (int i = 0; i < size1; i++) {
    for(int j=0;j<size1-i-1;j++) {
     if (arr1[j]>arr1[j+1]){
      int temp=arr1[j];
      arr1[j]=arr1[j+1];
      arr1[j+1]=temp;
    }}}}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSorting b=new BubbleSorting();

        b.bubbleSort(arr,size);
    for (int i=0;i<size;i++) {
        System.out.print(arr[i]+" ");
    }
    sc.close();
}}
