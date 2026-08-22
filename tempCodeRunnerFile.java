class Solution {
    public void nextPermutation(int[] nums) {

        int ind = -1;
        int n = nums.length;

        // 1. Find first smaller element from right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // 2. No index found
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 3. Find greater element from right
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swapp(nums, i, ind);
                break;
            }
        }

        // 4. Reverse right part
        reverse(nums, ind + 1, n - 1);
    }

    public static void swapp(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swapp(nums, i, j);
            i++;
            j--;
        }
    }
}