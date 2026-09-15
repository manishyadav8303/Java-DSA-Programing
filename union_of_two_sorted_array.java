public class union_of_two_sorted_array {
    // public static void main(String[] args) {
    //     int arr1[] ={1,2,3,4,5};
    //     int arr2[] = {6,7,8,9};
    //         int arr[]= merge(arr1, arr2);
    //     for(int i =0 ; i<arr.length ;i++){
    //         System.out.println(arr[i]);
    //     }}
        public  static int[] merge(int arr1[] , int arr2[]){
        int i = 0 ; int j = 0;int k = 0;
         int arr[] = new int[arr1.length+arr2.length];
        while(i<arr1.length && j <arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k]= arr1[i];
                k++;
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
            while(i<arr1.length){
                arr[k]= arr1[i];
                k++;
                i++;
            }
            while(j<arr2.length){
             arr[k] = arr2[j];
                j++;
                k++;
            }
        
        return arr;
        
        }
    
    }

