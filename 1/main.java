class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        final HashMap<Integer, Integer> presented = new HashMap<Integer, Integer>();
        for (i = 0; i < nums.length; i++)
        {
            final int n = nums[i];
            final Integer j = presented.get(target - n);
            if (j != null)
            {
                final int[] result = new int[2];
                result[0] = i;
                result[1] = j;
                return result;
            }
            presented.put(n, i);
        }
        return null;
    }
}
