public class alphabetmerge {
    public static void mergesor(String arr[] ,int sIdx , int eIdx ){
        if(sIdx >= eIdx){
            return;
        }

        int mid = sIdx + (eIdx-sIdx)/2;
        mergesor(arr, sIdx, mid);
        mergesor(arr, mid+1, eIdx);
        merge(arr, sIdx, mid, eIdx);
    }

        public static void merge(String arr[] , int sIdx ,int mid, int eIdx){
            String temp[] = new String[eIdx-sIdx+1];
            int i = sIdx;
            int j = mid+1;
            int k = 0 ; // iterator for temp

            while(i <= mid && j<= eIdx){
                if(arr[i].compareTo(arr[j])<0){
                    temp[k] = arr[i];
                    i++ ; k++;
                }else{
                    temp[k] = arr[j];
                    j++ ; k++;
                }
            }
            while (i<=mid) {
            temp[k++] = arr[i++];                
            }

            while (j<=eIdx){
                temp[k++] = arr[j++];
            }
            // copy 
            for(i = sIdx , k = 0 ; k<temp.length; k++ , i++){
                arr[i] = temp[k];
            }
        }
        public static void print(String arr[]){
            for(int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
         public static void main(String[] args) {

        String arr[] = {"sun", "earth", "mars", "mercury"};

        mergesor(arr, 0, arr.length-1);

        print(arr);;
    }


}


