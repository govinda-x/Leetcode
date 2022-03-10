class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=1;i<=num;i++){
            if(sum(i)){
                c++;
            }
        }
        return c;
    }
    
    public boolean sum(int n){
        int digit=0;
        int sum=0;
        while(n > 0){     
        digit = n % 10;  
        sum = sum + digit;  
        n = n / 10;  
        }
        return sum%2==0?true:false;
    }
}