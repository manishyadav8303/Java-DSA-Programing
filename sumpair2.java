import java.util.ArrayList;

public class sumpair2 {
    public static boolean sumpa(ArrayList<Integer>height ,  int target){
        //int lp = 0;
        int n = height.size();
        int pivot = 0;
       // int rp = height.size()-1;
       for(int i = 0 ; i<=n ; i++){
        if(height.get(i)>height.get(i+1)){
            pivot = i;
            break;
        }
       }
    int rp = pivot;
    int lp = rp+1;
       while(lp!=rp){
        if(height.get(lp)+height.get(rp) == target){
            return true;
        }
        if(height.get(lp)+height.get(rp) < target){
            lp =(lp+1)%n ;
        }else{
            rp = (n+rp-1)%n;
        }
       }
       return false;


    }
     public static void main(String[] args) {
       // int height[] = {1,8,6,2,5,4,8,3,7};
       ArrayList<Integer> height = new ArrayList<>();
       height.add(11);
       height.add(15);
       height.add(6);
       height.add(8);
       height.add(9);
       height.add(0);
    //    height.add(8);
    //    height.add(3); 
    //    height.add(7);
      //  System.out.println(sumpair(height, 10));
    System.out.println(sumpa(height, 99));
    }
    
}

