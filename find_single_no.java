public class find_single_no {
    public static int findno(int [] arr){
        int xor = 0;
        for(int i = 0 ; i<arr.length ; i++){
            xor = xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args){
        int arr[] = { 1,1,2,3,3,4,4};
        System.out.println(findno(arr));
    }
}
