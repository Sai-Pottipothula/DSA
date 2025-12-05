class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> q = new ArrayDeque<>();
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while (!q.isEmpty() && nums[j] >= nums[q.peekLast()]) q.removeLast();
            q.addLast(j);
            if (q.peekFirst() <= j - k) q.removeFirst();
            if (j >= k - 1) res[i++] = nums[q.peekFirst()];
        }
        return res;
    }
}
