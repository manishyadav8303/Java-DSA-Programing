public class largestsubarryprint {
    public  static  void largsub(int arr[]){
        int sum = arr[0];
        int maxsum = arr[0];
        int st = 0;
        int end =0;
        int start = 0;

        for(int i = 1 ; i<arr.length ; i++){
            if(sum<arr[i]){
                sum = arr[i];
                st = i;
            }else{
                sum = sum+arr[i];
            }
            if(sum>maxsum){
                maxsum = sum;
            start = st;
                end = i;
            }
        }
        for(int i = start ; i<=end ; i++){
            System.out.println(arr[i]);
        }
    }
}
