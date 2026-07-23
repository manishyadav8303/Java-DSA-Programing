import java.util.*; 
public class binarysearch {
    public static int binsearch(int n[] , int key){
        int start = 0 ;
        int end = (n.length) - 1 ;
        while (start<=end){
            int mid = (start+end)/2;
            if (n[mid] == key){
                return mid;
            }
            if (n [mid]<key){
                start = mid +1;

            }else{
                end = mid-1;
            }
        }return -1;
        
    }
    public static void main(String[] args) {
        int n[] = {22,45,56,23,65,54,87,76,43,65};
        int key = 23;
        Arrays.sort(n);
        System.out.println(binsearch(n, key));
    }
    
}
