import java.util.ArrayList;

public class araylistmaxvalue {
     public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(15);
        list.add(5);
        list.add(6);
      //  System.out.println(list);
       int  maxValue = Integer.MIN_VALUE;

       for(int i = 0 ; i<list.size() ; i++){
        if(list.get(i)>maxValue){
            maxValue = list.get(i);
        }
       }
       System.out.println(maxValue);
    }
}
// o(N)
