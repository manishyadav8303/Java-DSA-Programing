public class maxpr {
    public static int maxpr(int arr[]){
        int maxpro = arr[2] ;
        int smaxpr = 0;
        for(int i = 0 ; i<arr.length ; i++){
            int c = Math.max(arr[i], maxpro);
            smaxpr = maxpro;
            maxpro = c;
        }
        return arr[0]+maxpro+smaxpr;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        System.out.println(maxpr(arr));
    }
}
