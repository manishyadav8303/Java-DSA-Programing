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
    public static void quicksort(int arr[] , int st_i , int en_i){
        if(st_i >= en_i){
            return;
        }
        int pivotIDX = partion(arr, st_i, en_i);

        quicksort(arr, st_i, pivotIDX-1);
        quicksort(arr, pivotIDX+1, en_i);
    }


    public static int partion(int arr[] , int st_i ,int en_i){
        int pivot =  arr[en_i];
        int i = st_i-1;
        for( int j=st_i ; j<en_i ; j++){
            if(arr[j] <=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i] = temp;
                 
            }
            
        }
        i++;
            int temp = arr[i];
                arr[i]=arr[en_i];
                arr[en_i] = temp;
                return i;

    }

    public static void main(String[] args) {
        int arr[] = {3,5,2,9,8,7,-2};
        //divide(arr,0 , arr.length-1);
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
