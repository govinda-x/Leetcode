class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five=0, ten=0, twen=0;
        for(int i:bills){
            if(i==5){
                five++;
            }
            else if(i==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else return false;
            }
            else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                    twen++;
                }
                else if(five/3>0){
                    five-=3;
                    twen++;
                }
                else return false;
            }            
        }
        return true;
    }
}