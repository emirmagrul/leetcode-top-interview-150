public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;
        int duplicates = 0;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (last != cur) {
                duplicates = 0;
                nums[k++] = cur;
                last = cur;
            } else {
                duplicates++;
                if (duplicates > 1) {
                    continue;
                }
                nums[k++] = cur;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray2 sol = new RemoveDuplicatesFromSortedArray2();
        System.out.println(sol.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}

