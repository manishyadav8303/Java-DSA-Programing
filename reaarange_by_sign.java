import java.util.Arrays;

public class reaarange_by_sign {
    public static int[] rearr(int arr[]){
        int n = arr.length;
        int pos = 0;
        int neg = 1;
        int ans[] = new int[n];
        for(int i =0 ; i<n ; i++){
            if(arr[i] < 0){
                ans[neg] = arr[i];
                neg +=2;
            }else{
                ans[pos] = arr[i];
                pos +=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearr(arr)));
    }
}
