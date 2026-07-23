import java.util.*;
public class array {
    public static void update(int marks[]){
        for( int i = 0 ; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static int liner_search(int number[] ,int key){
        for (int i = 0 ; i<number.length ; i++){
            if (number[i] ==  key){
                return i;
            }
        
        }
        return -1 ;
    }
    public static int largest(int number[]){
        int largest = Integer.MIN_VALUE ; // negative infinty 
        int samllest = Integer.MAX_VALUE;
        for (int i = 1 ; i< number.length ; i++){
            if (largest<number[i]){
                largest = number[i];
            }
            if (samllest>number[i]){
                samllest = number[i];
                
            }
            
        }
        System.out.println ("smallest value "+ samllest);
        
        return largest;
    }
    public static void swap(int number[] ){
        int first =0 , last = number.length-1 ;
        while (first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[] = {45,54,33,87,43,65,21,34, 99};
        swap(number);
        for(int i =0 ; i<number.length ; i++ ){
            System.out.print(number[i]+" ");
        }
     //   System.out.println();
        // largest(number);
        // System.out.println("largest no. among all the variabe " + largest(number));
        // int key=34;
        // int index = liner_search(number,key);
        // System.out.println(index);
    //     int marks[] ={89,37,77};
    //     update(marks);

    //     for (int i =0 ; i<marks.length; i++){
    //         System.out.println(marks[i]);
    //     }
    //     System.err.println();
    // }
    
}
}
