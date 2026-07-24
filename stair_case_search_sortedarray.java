public class stair_case_search_sortedarray {
    public static boolean searchkey(int matrix[][] , int key){
        int row = 0 ; int col = matrix[0].length-1;
        while(row<matrix.length && col>=0 ){
            if(matrix[row][col]== key){
                System.out.print("Found at"+row+","+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("not found");
        return false; 
    }
 
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                    {27,29,37,48}
                };
            int key = 48;
            searchkey(matrix, key);
    }
    
}
