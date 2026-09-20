public class peakele {
    public static  int[] peak(int mat[][]){
        //base
        int rows = mat.length;
        int  col = mat[0].length;
        int low =0;
        int high = col-1;

        //maxrow in a col 
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxrow = 0;
            for(int row = 1 ; row<rows ; row++){
                if(mat[row][mid]>mat[maxrow][mid]){
                    maxrow = row;
                }
            }
             //curr elem
             int left = mid-1>=0 ? mat[maxrow][mid-1]: -1;
             int rigth = mid+1<col ? mat[maxrow][mid+1]: -1;

             //peak foound
             if(mat[maxrow][mid]>left && mat[maxrow][mid]>rigth){
                return new int[]{maxrow , mid};
             }
        //left bigger
        if(left>mat[maxrow][mid]){
            high = mid-1;
        }else{
            low = mid+1;
        }
        }
        return new int[]{-1 , -1};
       
        
    }
}
