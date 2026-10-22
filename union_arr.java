import java.util.HashSet;

public class union_arr {
   
    public static int intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums1){
            hs.add(num);
        }
        for(int num: nums2){
            hs.add(num);
        }
        
        return hs.size();
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,1,2};
       int  arr2[]= {1,3,4,5,2,3,2,1,3,2};
       System.out.println(intersection(arr1, arr2));
    }
}

