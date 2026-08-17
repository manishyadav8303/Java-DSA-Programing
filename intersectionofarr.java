// import java.util.Arrays;

// public class intersectionofarr {
//     public static void inter(int a[] , int b[]){
//         int num[] = new int[Math.max(a.length, b.length)];
//         int i = 0 ;
//         int k = 0 ;
//          int j = 0;
//          while(i<a.length && j < b.length ){
//             if(a[i] == b[j]){
//                 num[k] = a[i];
//                 k++;
//                 i++;
//                 j++;
//             }
//             else if(a[i]<b[j]){
//                 i++;
//             }else{
//                 j++;
//             }
//          }
//         System.out.println(Arrays.toString(Arrays.copyOf(num, k)));
        
//     }
   // public static void main(String[] args) {
        // int a[] ={1,2,3,4,5};
        // int b[]= { 2,4,5,6,7};
        // inter(a, b);


//     }
// }
public class intersectionofarr {

    public static void inter(int a[], int b[]) {

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
            else if (a[i] < b[j]) {
                i++;
            }
            else {
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5,9};
        int b[] = {2, 4, 5, 6, 7};

        inter(a, b);
    }
}