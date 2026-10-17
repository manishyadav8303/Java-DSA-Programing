import java.util.Arrays;

public class non_overlaping {
    public  static int nonover(int [][] nums){
        Arrays.sort(nums , (a,b) -> a[1] - b[1]);
        int remmove = 0;
        int end = nums[0][1];
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i][0]>= end){
                end = nums[i][1];
            }else{
                remmove++;
            }
        }
        return  remmove;
    }
    public static void main(String[] args) {
        int nums[][] = {{2,10} , {10,20} , {10,40} , {40,50}};
        System.out.println(nonover(nums));
    }
}
