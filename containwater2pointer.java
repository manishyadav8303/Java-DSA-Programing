import java.util.ArrayList;

public class containwater2pointer {
    public static int watercontain(ArrayList<Integer>height){
        int maxwater = 0;
        int left = 0;
        int right = height.size()-1;
        while(left<right){
            int water = Math.min(height.get(left), height.get(right)) * (right-left);
            // int length = Math.min(height.get(right), height.get(left));
            // int width = right-left;
            // int water = length*width;
           maxwater = Math.max(maxwater, water);
            if(height.get(left)<height.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;
    }
     public static void main(String[] args) {
       // int height[] = {1,8,6,2,5,4,8,3,7};
       ArrayList<Integer> height = new ArrayList<>();
       height.add(1);
       height.add(8);
       height.add(6);
       height.add(2);
       height.add(5);
       height.add(4);
       height.add(8);
       height.add(3);
       height.add(7);

System.out.println((watercontain(height)));
    }
}
