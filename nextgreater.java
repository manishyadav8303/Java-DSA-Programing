import java.util.Stack;

public class nextgreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        Stack <Integer> s = new Stack<>();
        int nextgre[] = new int[arr.length];

        for(int i =arr.length -1 ; i>=0 ; i-- ){
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()){
                nextgre[i] = -1;
            }else{
                nextgre[i]= arr[s.peek()];
            }
            s.push(i);
        }
       for(int i = 0 ; i<nextgre.length ;i++){
        System.out.print(nextgre[i] +" ");
       } 
       System.out.println();
    }
}
