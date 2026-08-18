public class longestsubaaray_sum {
    public static int longest(int arr[] , int k){
        int left = 0 , right = 0;
        int maxlen = 0;
        int sum = 0;
        int n = arr.length;
        while(right<n){
            while(left <= right && sum>k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right-left+1);

            }
            right++;
            if(right <n ){
                sum += arr[right];
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 5;
        System.out.println(longest(arr, k));
    }
}
