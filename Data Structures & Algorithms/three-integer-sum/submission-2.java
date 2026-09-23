class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            int totalToFind = -nums[i];
            while (left < right) {
                if (nums[left] + nums[right]
                    < totalToFind) { // rightmost is the biggest number but still < totalToFind,
                                     // need to increase left
                    left++;
                } else if (nums[left] + nums[right] == totalToFind) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
