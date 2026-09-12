public class heapsort {
    public static void hsort(int arr[]){
        int n = arr.length;
        //maxheap create
        for(int i = n/2 ; i>= 0 ; i--){
            heapify(arr ,0 , n);
        }
        //push the larghest at end 
        for(int i = n-1 ; i>=0 ; i--){
            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;
            heapify(arr , 0 , i);
        }
    }
    private static void heapify(int arr[] , int i , int size){
        int left = i*2+1;
        int right = i*2+2;
        int maxInt = i;

        if(left < size && arr[left] > arr[maxInt]){
            maxInt = left;
        }
        if(right < size && arr[right] > arr[maxInt]){
            maxInt = right;
        }
        // swap 
        if(maxInt != i){
            int temp = arr[i];
            arr[i] = arr[maxInt];
            arr[maxInt] = temp;

            heapify(arr, maxInt, size);
        }


    }
    public static void main(String[] args) {
        int arr[] = {3,2,7,1,5,8,9};

        hsort(arr);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
