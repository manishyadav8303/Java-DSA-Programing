public class mergesort {
    public static void divide(int arr[] , int st_i , int en_i){
        // base
        if(st_i >= en_i){
            return;
        }
        
        //kaam
        int mid = st_i + (en_i-st_i)/2;
        divide(arr, st_i, mid);
        divide(arr, mid+1 , en_i);
        merge( arr, st_i,  mid ,  en_i);
    } 
    public static void merge(int arr[] , int st_i , int mid, int en_i ){
         int temp[] = new int[en_i-st_i+1];
         int i = st_i; // iterator for left 
         int j = mid+1; // iterstor for right
         int k =0; // iterator for temp
         //merge

         while (i <=mid && j <=en_i) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                k++ ;
                i++;
            }else{
                temp[k] = arr[j];
                k++;
                j++;
            }

         }

         // left
         while(i<=mid){
            temp[k++] = arr[i++];
         }
         // right

         while (j<=en_i) {
            temp[k++] = arr[j++]; 
            
         }
         for( k=0 , i=st_i ; k< temp.length ; k++ , i++){
            //temp[k++] = arr[j++];
            arr[i] = temp[k];
         }
    }
    public static void printarr(int arr[]) {
        for(int i = 0 ; i<arr.length ; i++){
            System.err.print(arr[i]+"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {3,5,2,9,8,7,-2};
        divide(arr,0 , arr.length-1);
        printarr(arr);
    }
}
