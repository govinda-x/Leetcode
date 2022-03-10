class NumArray {
    int[] a = new int[10000];
    public NumArray(int[] nums) {
        a[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            a[i] = a[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return a[right];
        return a[right] - a[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */