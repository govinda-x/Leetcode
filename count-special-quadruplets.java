class Solution {
    public int countQuadruplets(int[] arr) {
        int i,j,k,n=arr.length,c=0;
        for(i=0;i<n-3;i++){
            for(j=i+1;j<n-2;j++){
                for(k=j+1;k<n-1;k++){
                    for(int m=k+1;m<n;m++){
                        if(arr[i]+arr[j]+arr[k]==arr[m]) c++;
                    }
                }
            }
        }
        return c;
    }
}