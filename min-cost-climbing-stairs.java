class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1) return cost[0];
        int a= cost[0], b= cost[1];
        for(int i=2;i<cost.length;i++){
            int sum = cost[i]+Math.min(a,b);
            a=b;
            b=sum;
        }
        return Math.min(a,b);
    }
}