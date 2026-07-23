// public class selsort_recuirsion {
//     public static void selsort(int arr[], int i) {
//         if (i == arr.length-1 ){
//             return;
//         }
//         int minpos = i;
//         for(int j = i+1 ; j<arr.length ; j++){
//             if(arr[j]< arr[minpos]){
//                 minpos = j;
//         }
//         int temp = arr[minpos];
//         arr[minpos]= arr[i];
//         arr[i] = temp;
//         selsort(arr, i+1);

//     }
    
// }
// public static void print(int arr[]) {
//     for(int x:arr){
//         System.err.print(x+" ");
//     }    
// }

public static void selecsort(int arr[]) {
    for(int i = 0 ; i<arr.length-1 ; i++){
        int minpos = i;
        for(int j = i+1 ; j<arr.length ; j++){
            if(arr[minpos]>arr[j]){
                // minpos = j;
                int temp = arr[minpos];
        arr[minpos]=arr[j];
        arr[j]=temp;
            }
        }
        //swap
        // int temp = arr[minpos];
        // arr[minpos]=arr[i];
        // arr[i]=temp;
    }
    
}
public static void insertion(int arr[]){
    for(int i = 0 ; i<arr.length ; i++){
        int curr = arr[i];
        int prev = i-1;
        while(prev >0  &&  arr[prev]>curr){
            arr[prev+1]= arr[prev];
            prev--;
        }
        arr[prev+1]= curr;
    }
}

public static void printt(int arr[]){
    for(int x: arr){
        System.out.print(x);
    }
}

public static void main(String[] args) {
    int arr[] = {1,2,5,3,8,4,9,3};
    insertion(arr);
    printt(arr);
    
}

