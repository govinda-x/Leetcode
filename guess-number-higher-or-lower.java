public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1, e =n;
        while(s<=e){
            int mid = s+(e-s)/2;
            int num =guess(mid);
            if(num == 0){
                return mid;
            }
            else if(num<0){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
}