class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] a1 = new int[nums.length-n];
        int[] a2 = new int[nums.length-n];
        int p1=0, p2=0;
        for(int i=0;i<nums.length; i++)
        {
            if(i<n)
            {
                a1[p1]=nums[i];
                p1++;
            }
            else
            {
                a2[p2]=nums[i];
                p2++;
            }
        }
        p1=0;
        p2=0;
        for(int i=0;i<nums.length; i++)
        {
            if(i%2==0)
            {
                nums[i]=a1[p1];
                p1++;
            }
            else
            {
                nums[i]=a2[p2];
                p2++;
            }
        }
        return nums;
    }
}