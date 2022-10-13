import java.util.Scanner;
public class MergeSort {
    static void mergeProcedure(int a[],int p,int mid,int q){
        int n1=mid-p+1;
        int n2=q-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for (int i=0;i<n1;i++) { arr1[i]=a[p+i];}
        for (int j=0;j<n2;j++) { arr2[j]=a[mid+1+j];}
        int i=0,j=0;
        int k=p;
        while (i<n1 && j<n2) {
            if (arr1[i]<arr2[j]){
                a[k]=arr1[i];
                i++;
                k++;
            }
            else{
                a[k]=arr2[j];
                j++;
                k++;}
            }
        while (i<n1){
 a[k]=arr1[i];
            i++;
            k++;
        }
        while (j<n2){
            a[k]=arr2[j];
            j++;
            k++;}



    }
    static void mergeSort(int a[],int i,int j){
if (i<j){
    int mid=i+(j-i)/2;
    mergeSort(a,i,mid);
    mergeSort(a, mid+1, j);
    mergeProcedure(a,i,mid,j);
} 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,size-1);
    for (int i:arr){
        System.out.print(i+" ");
    }
    sc.close();
    }
}
