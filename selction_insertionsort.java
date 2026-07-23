public class selction_insertionsort {
    public static void selSort(int arr[]){
        // outer loop i = turn
        for(int i = 0 ; i < arr.length-1; i++){
            int minPos = i;
            //innerlop
            for(int j = i+1; j< arr.length; j++){
                if (arr[minPos] > arr[j]){
                    minPos= j;
                }
                 
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }
    // public static void selesort(int arr[]){
    //     for(int i=0; i<arr.length -1 ; i++){
    //         int minpos=i;
    //         for (int j = i+1 ; j<arr.length ; j++){
    //             if(arr[minpos]>arr[j]){
    //                 minpos = j;
    //             }
    //         }
    //         //swap
    //         int temp = arr[minpos];
    //         arr[minpos] = arr[i];
    //         arr[i] = temp;
    //     }
    // }
    public static void ins_sort(int arr[]){
        for (int i =1 ; i< arr.length ; i++){
            int current = arr[i];
            int previous = i-1;
            while(previous>=0 && arr[previous]>current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1]= current;
            
        }
    }
    public static void inssort(int arr[]){
        for(int i =1 ; i<arr.length ; i++){
            int current = arr[i];
            int previous = arr[i-1];
            while (previous>=0 && arr[previous]>current){
                arr[previous +1 ] = arr[previous]; // shift greater value to right side
                previous --;// left side check all
            }
            arr[previous+1]=current;//place currebt elemt to his right posiion
        }
    }
    public static void countsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length ; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }
        // shorting
        int j =0;
        for(int i =0 ; i<count.length;i++){
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
        
    }


    public static void printsort (int arr[]){
        for(int i =0 ;i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3};
        selSort(arr);
        printsort(arr);
    } 
    
        
    }
    

