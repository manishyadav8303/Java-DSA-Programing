import java.util.*;

class leaderarr {

    public static ArrayList<Integer> findLeaders(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[arr.length - 1];
        ans.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans = findLeaders(arr);

        // Print
        for (int x : ans) { 
            System.out.print(x + " ");
        }
    }
}