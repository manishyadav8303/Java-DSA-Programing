// union and sorting of array

public static ArrayList<Integer> sortedArray(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;

        TreeSet<Integer> st = new TreeSet<>();

        for (int i = 0; i < n1; i++) {
            st.add(a[i]);
        }

        for (int i = 0; i < n2; i++) {
            st.add(b[i]);
        }

        ArrayList<Integer> temp = new ArrayList<>();

        for (int it : st) {
            temp.add(it);
        }

        return temp;
   
}
