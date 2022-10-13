import java.util.Scanner;
public class BinarySearch {
    static int binarySearch(int arr[], int l, int r, int x)
    { if (l>r){
        return -1;
    }
    

        else if (r >= l) {
            int mid = l + (r - l) / 2;
 

            if (arr[mid] == x)
                return mid;
 
           
            else if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(binarySearch(arr,0,size-1,target));
    sc.close();
    }
}
