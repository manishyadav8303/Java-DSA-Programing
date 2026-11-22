import java.util.HashSet;

public class unique_sitinct_element {
    public static int unique(int arr[]){
        HashSet<Integer> ans = new HashSet<>();
        for(Integer num:arr ){
            ans.add(num);
        }
        return ans.size();
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,3,2};
        System.out.println(unique(arr));
    }
}
