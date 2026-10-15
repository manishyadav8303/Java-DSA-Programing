import java.util.Arrays;

public class minimum_ballon {
            public  static int brust(int[][] nums){
                Arrays.sort(nums , (a,b) -> Integer.compare(a[1] , b[1]));
                int arrow = nums[0][1];
                int cout = 1;
                for(int i = 0 ; i<nums.length ; i++){
                    if(nums[i][0] <= arrow){
                        cout ++;
                        arrow = nums[i][1];
                    }
                }
                return cout;

}

    
}
