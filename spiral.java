public class spiral {

public static void spiralmatrix(int matrix[][]){
    int startrow = 0;
    int startcol =  0;
    int endrow = matrix.length-1;
    int endcol = matrix[0].length-1;

    while(startrow <= endrow && startcol <= endcol){
        // top
        for(int j = startcol ; j<=endcol ; j++ ){
            System.out.print(matrix[startrow][j]+" ");
        }
        // right
        for(int j = startrow +1 ; j<=endrow ;j++){
            System.out.print(matrix[j][endcol]+" ");
        }

        // bottom

        for(int j = endcol-1 ; j>=startcol ; j--){
            System.out.print(matrix[endrow][j]+" ");
        }

        // up
        for(int j = endrow-1 ; j>=startrow+1 ; j--){
            System.out.print(matrix[j][startcol]+" ");
        }
        startrow++;
        endrow--;
        startcol++;
        endcol--;
    }
    System.out.println();
}

public static void main(String[] args){
    int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                    {9,10,11,12},
                {13,14,15,16}};
    spiralmatrix(matrix);
}
    
}
