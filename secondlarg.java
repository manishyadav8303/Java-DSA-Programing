public class secondlarg {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(slar(arr));
    }

    public static int slar(int arr[]) {
        int largets = arr[0];
        int seclarg = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largets) {
                seclarg = largets;
                largets = arr[i];
            } else if (arr[i] < largets && arr[i] > seclarg) {
                seclarg = arr[i];
            }
        }

        return seclarg;
    }
}