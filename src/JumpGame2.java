public class JumpGame2 {
    public int jump(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return 0;
        }
        int index = 0;
        int jumps = 0;

        while (index < len - 1) {
            int cur = nums[index];
            if (index + cur >= len - 1) {
                return ++jumps;
            }
            int farthestReach = 0;
            int nextIndex = 0;
            for (int i = 1; i <= cur; i++) {
                int currentReach = (index + i) + nums[index + i];
                if (currentReach > farthestReach) {
                    farthestReach = currentReach;
                    nextIndex = index + i;
                }
            }
            jumps++;
            index = nextIndex;

        }
        return jumps;
    }
}
