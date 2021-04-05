class Solution {
    public boolean isMonotonic(int[] A) {
        if(A.length <=1){
            return true;
        }
        if(A[0]<=A[A.length-1]){
            for(int i=0; i<A.length-1; i++)
            {
                if(A[i]<=A[i+1]){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        else{
            for(int i=0; i<A.length-1; i++)
            {
                if(A[i]>=A[i+1]){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}