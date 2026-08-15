import java.util.ArrayList;

public class multidimensionalAL {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>>Mainlist = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();

        for(int i = 1 ; i<=5 ; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);     
        }
        Mainlist.add(list1);
        Mainlist.add(list2);
        Mainlist.add(list3);
        System.out.println(Mainlist);

        for(int i = 0 ; i<Mainlist.size() ; i++){
           ArrayList<Integer> curr = new ArrayList<>(Mainlist.get(i));
           System.out.println(curr);
        //    ArrayList<Integer> curr = Mainlist.get(i);
        //    for(int j = 0 ; j< Mainlist.size() ; j++){
        //     System.out.print(curr.get(j)+" ");
        //    }
        //    System.out.println();
        }
        

    }
}
