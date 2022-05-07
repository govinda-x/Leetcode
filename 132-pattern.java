class Solution {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        int temp = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i >= 0; i--) {     
            if(nums[i] < temp)  return true;
            while(!stack.isEmpty() && nums[i] > stack.peek())  temp = stack.pop();
            stack.push(nums[i]);
        } 
        return false;
    }
}