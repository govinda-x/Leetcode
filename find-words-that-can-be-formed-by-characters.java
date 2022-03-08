class Solution {
    public int countCharacters(String[] words, String chars) {
        int [] count = new int[26];
        for(int i=0; i<chars.length(); i++){
            count[(int)(chars.charAt(i)-97)]++;
        }
        int sum=0;
        for(String i : words){
            int [] check = new int[26];
            int flag=0;
            for(int j=0; j<i.length(); j++){
                int num = (int)(i.charAt(j)-97);
                check[num]++;
                if(check[num]>count[num] || count[num]==0){
                    flag=1; 
                    break;
                }
            }
            if(flag == 0) sum+=i.length(); 
        }
        return sum;
    }
}