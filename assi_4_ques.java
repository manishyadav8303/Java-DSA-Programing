public class assi_4_ques {
    public static int trap_water(int height[]){
        // maxleft height
        int maxLeft[] = new int[height.length];
        maxLeft[0]= height[0];
        for(int i = 1 ; i<height.length ; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);
        }
        

        // maxright height 
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2 ; i>=0 ; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        // trapped water
        int trapped_water =0;
        for(int i =0 ; i<height.length ; i++){
            int trapwater = Math.min(maxLeft[i], rightmax[i]);
            trapped_water += trapwater - height[i];

        }
        return trapped_water;

    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap_water(height));
    }
}
