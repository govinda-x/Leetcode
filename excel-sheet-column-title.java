class Solution{
    public String convertToTitle(int columnNumber) {   
        StringBuffer str = new StringBuffer();
        while(columnNumber!=0){
            int x=columnNumber%26;
            if(x==0) x=26;
            columnNumber-=x;
            columnNumber/=26;
            int y=x+'A'-1;
            str.append((char)(y));
        }
        return str.reverse().toString();
    }
}