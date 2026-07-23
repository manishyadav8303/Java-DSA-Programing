public class bubblesort_recursion {
    public static void buble(int arr[] , int n ) {
        if (n==1){
            return;
        }
        for(int i =0  ;i<n-1 ; i++){
            //swap
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
            }
        }
        buble(arr, n-1);

        
    }
    public static void print (int arr[]) {
        for (int x:arr){
            System.out.print(x+" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={6,3,8,3,9,2,1};
        buble(arr, arr.length);
        print(arr);
    }
    
}
