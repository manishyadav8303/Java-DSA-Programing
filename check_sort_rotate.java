public class check_sort_rotate {
    public static  boolean CHECK(int arr[]){
    int count = 0;
    for(int i = 0 ; i<arr.length ; i++){
        if(arr[i]>arr[(i+1)%arr.length]){
            count++;
        }
    }
    return  count <=1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(CHECK(arr));
    }
}
