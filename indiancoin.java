import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class indiancoin {
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin , Comparator.reverseOrder());

        int count = 0 ;
        int amt = 2353;
        LinkedList<Integer> ans = new LinkedList<>();
        for(int i = 0 ; i<coin.length ; i++){
            if(coin[i] <= amt){
                while(coin[i] <= amt){
                    ans.add(coin[i]);
                    count++;
                    amt -= coin[i];
                }
            }
        }
        System.out.println(count);

        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+"  ");
        }
        System.out.println();
    }
}
