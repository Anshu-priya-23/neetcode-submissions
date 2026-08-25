class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        backtrack(nums, 0, new ArrayList<>(), ans);
        
        return ans;
    }

    void backtrack(int[] nums, int index, 
                   List<Integer> current, 
                   List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // take
        current.add(nums[index]);
        backtrack(nums, index + 1, current, ans);

        // not take
        current.remove(current.size() - 1);
        backtrack(nums, index + 1, current, ans);
    }
}