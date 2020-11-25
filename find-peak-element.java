class Solution {
    public int findPeakElement(int[] A) 
    {
        return bS(A,0,A.length-1);
​
    }
    public static int bS(int[] A, int l, int r)
    {
        if(l==r)
        {
            return l;
        }
        int mid =(l+r)/2;
        if(A[mid]>A[mid+1])
        {
            return bS(A,l,mid);
        }
        return bS(A,mid+1,r);
    }
}
