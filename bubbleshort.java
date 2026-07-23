public class bubbleshort {
    // public static void shorting(int arr[]){
    //     for (int turn = 0 ; turn<arr.length -1 ; turn++){
    //         boolean swapped = false;
    //         for (int j =0 ; j< arr.length-1-turn; j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp =arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //                 swapped = true;

    //             }
    //         }
    //         if(!swapped){
    //             break;
    //         }
    //     }
    // }
    // public static void bublesort(int arr[]){
    //     for(int turn = 0 ; turn < arr.length -1 ; turn++){
    //         for (int j = 0 ; j<arr.length - 1 - turn ; j++){
    //             if (arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;

    //             }

    //         }

    //     }
    // }
    // public static void pri(int arr[]){
    //     for(int i =0; i<arr.length ; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    // // public static void prit(int arr[]){
    // //     for(int i = 0 ;i<arr.length ; i++){

    // //         System.out.print(arr[i]+" ");

    // //     }
    // //     System.out.println();
    // // }
    public static void bubble(int arr[]){
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j = 0 ; j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,4};
        bubble(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

        // prit(arr);
   
    // int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3};
    // bublesort(arr);
    // pri(arr);
    
     }
    

