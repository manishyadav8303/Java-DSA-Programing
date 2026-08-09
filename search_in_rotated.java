public class search_in_rotated {
    public static int search(int arr[] , int tar , int st_i , int en_i){
        //base condition
        if(st_i > en_i){
            return -1;
        }
        //kaam
        int mid = st_i+(en_i-st_i)/2;

        if(arr[mid] == tar){
            return mid;
        }
        // in l1
        if(arr[st_i] <= arr[mid]){

            if(arr[st_i]<= tar && tar <= arr[mid]){
                //case 1
                return search(arr, tar, st_i, mid-1);
            }else{
                //  case2
                return search(arr, tar, mid+1 , en_i);
            }

        }else{
            // line 2
            if(arr[mid] <= tar && tar <= arr[en_i]){
                return search(arr, tar, mid+1, en_i);
            }else{
                return search(arr, tar, st_i, mid-1);
            } 
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 7, 0, arr.length-1));
    }
}
