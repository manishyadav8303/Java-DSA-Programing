import java.lang.reflect.Array;
import java.util.*;

public class reverseing {
    public static void reverseing(int arr[]){
        int first =0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        // System.err.println();
    }
    public static int bubble(int arr[] , int key){
        int first = 0 ; 
        int last = arr.length-1;
        int mid = (first+last)/2;
        while(first<=last){
            if(arr[mid] ==key){
                return mid;
            }
            if(arr[mid]>key){
                first =mid-1;
            }
            else{
                last = mid-1;
            }
              
        }return -1; 
        
    }
    // public static int binsearch(int n[] , int key){
    //     int start = 0 ;
    //     int end = (n.length) - 1 ;
    //     while (start<=end){
    //         int mid = (start+end)/2;
    //         if (n[mid] == key){
    //             return mid;
    //         }
    //         if (n [mid]<key){
    //             start = mid +1;

    //         }else{
    //             end = mid-1;
    //         }
    //     }return -1;
    public static void main(String[] args) {
        int arr[]= {3,4,6,2,9,5,7};
        int key = 9;
        Arrays.sort(arr);
        System.err.println(bubble(arr, key));
        
    }
}
//  public static void main(String[] args) {
//         int n[] = {22,45,56,23,65,54,87,76,43,65};
//         int key = 23;
//         
//         System.out.println(binsearch(n, key));
//     }
