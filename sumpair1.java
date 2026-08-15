import java.util.ArrayList;

public class sumpair1 {
public static boolean sumpair( ArrayList<Integer> height , int target){
    for(int i = 0 ; i<height.size() ; i++){
        for(int j=i+1 ; j<height.size(); j++){
            if(height.get(i)+height.get(j)==target){
                return true;
            }
        }
    }
    return false;
}
// two pinter approach
public static boolean sumpa( ArrayList<Integer> height , int target){
    int i = 0 ;
    int j = height.size()-1;
    while(i!=j){
        if(height.get(i)+height.get(j)== target){
            return true;
        }
        if(height.get(i)+height.get(j)<target){
            i++;
        }else{
            j--;
        }

    }
    return false;
}

    public static void main(String[] args) {
       // int height[] = {1,8,6,2,5,4,8,3,7};
       ArrayList<Integer> height = new ArrayList<>();
       height.add(1);
       height.add(2);
       height.add(3);
       height.add(4);
       height.add(5);
       height.add(6);
    //    height.add(8);
    //    height.add(3); 
    //    height.add(7);
      //  System.out.println(sumpair(height, 10));
    System.out.println(sumpa(height, 5));
    }
    
}
