public class splitarr {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int num:nums){
             low = Math.max(low, num);
            high += num;
        }
        while (low<=high) {
            int mid = low+(high-low)/2;
            int currsum = 0;
            int partiton = 1;
            for(int num:nums){
                if(currsum+num <= mid){
                    currsum+=num;
                }else{
                    partiton++;
                    currsum =num;
                }
            }
            if(partiton>k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}
