class Solution {
    public String reverseVowels(String s) 
    {
        if(s.length()==1) return s;
        int a=0, b =s.length()-1;
        char[] ch = s.toCharArray();
        while(a<b)
        {
            if(isVowel(ch[a]) & isVowel(ch[b]))
            {
                char temp=ch[a];
                ch[a]=ch[b];
                ch[b]=temp;
                a++;b--;
            }
            else if(isVowel(ch[a]) && !isVowel(ch[b]))
            {
                b--;
            }
            else
            {
                a++;
            }
        }
        return new String(ch);
    }
    public boolean isVowel(char c)
    {
        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }
        return false;
    }
}
