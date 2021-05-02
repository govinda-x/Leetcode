class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans =new ArrayList<Integer>();
        for(int i=left; i<=right; i++){
            if(decide(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean decide(int num){
        if(num%10==0){
            return false;
        }
        int temp = num;
        while(num!=0){
            int a = num%10;
            if(a==0){
                return false;
            }
            
            else if(temp%a==0){
                num/=10;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}