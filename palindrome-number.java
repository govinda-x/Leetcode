class Solution {
    public boolean isPalindrome(int n) 
    {
        int temp = n;
        if(n<0)
        {
            return false;
        }
        if(n<10 && n>=0)
        {
            return true;
        }
        int num = 0;
        while(n!=0)
        {
            int a = n%10;
            num = num*10+a;
            n=n/10;
        }
        if(temp == num)
        {
            return true;
        }
        return false;    
    }
}
