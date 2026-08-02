public class findkey {
    public static int findk(int arr[] , int key , int i){
        if(i ==  arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return findk(arr, key, i+1);
    }

    public static int lastoccr(int arr[] , int key , int i){
       if(i==arr.length){
        return -1;
       }
       int isfound = lastoccr(arr, key, i+1);
       if(isfound == -1 && arr[i] == key){
        return i;
       }
       return isfound;

    }

    public static void main(String[] args) {
        int arr[] = {1,4,2,5,7,5};
       // System.out.println(findk(arr, 8, 0));
       System.out.println(lastoccr(arr, 5, 0));
    }
}
