public class array_assig_ques2 {
    public static int search(int number[] , int target){
        int start = 0 , end = number.length -1 ;
        while(start<=end){
            int mid = (start+end) /2;
            if (number[mid] == target){
                return mid ;
            }
            if (number[end] <=number[mid]){
                if (target >= number[start]&& target<number[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int number[]={7,2,9,1,5};
        int target = 2;
        System.out.println(search(number, target));
    }

    
}
