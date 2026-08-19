import java.util.Arrays;

public class twosum {
    
    public static int[] twoSum(int[] nums, int target) {
        // for(int i = 0 ; i<nums.length ; i++){
        //     for(int j = i+1 ; j<nums.length; j++){
        //        if(nums[i]+nums[j]==target){
        //         return new int[]{i, j};
        //        }
        //     }
        // }
        // return new int[]{};
        Arrays.sort(nums);

        int st = 0 , end = nums.length-1;
        while(st<end){
            if(nums[st]+nums[end]== target){
                return new int[]{st,end};
            }
            else if(nums[st]+nums[end]<target){
                st++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 5};
    int target = 10;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        // int res[] = twoSum(arr, target);
        // System.out.println(res);
}
}
        
