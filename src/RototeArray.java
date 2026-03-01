public class RototeArray {
    //3 Ters Çevirme O(n) karmaşıklık
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    //Swap ile olan yöntem O(k*n) karmaşıklık
    /*
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < nums.length; j++) {
                swap(nums, 0, j);
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }*/
}
