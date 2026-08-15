public class containmostwater {
    public static int containwater(int[] hei){
        int maxwater = 0;
        for(int i = 0 ; i<hei.length ; i++){
            for(int j = i+1 ; j<hei.length ; j++){
                int water = Math.min(hei[i], hei[j])*(j-i);
                maxwater = Math.max(maxwater, water);
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int hei[] = {1,8,6,2,5,4,8,3,7};
System.out.println(containwater(hei));
    }
}
