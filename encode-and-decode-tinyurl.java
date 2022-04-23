public class Codec {

    HashMap<String, String> map = new HashMap<>();
      
    public String encode(String longUrl) {
        String ch = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String attachment ="", ans = "http://tinyurl.com/";
        while(true){
            for(int i=0; i<6; i++){
                int rand = (int)(Math.random()%62);
                attachment+=Character.toString(ch.charAt(rand));
            }
            if(map.containsKey(attachment)) continue;
            ans = "http://tinyurl.com/"+attachment;
            map.put(ans, longUrl);
            break;
        }
        return ans;
    }
    public String decode(String shortUrl) {
        if(!map.containsKey(shortUrl)) return "";
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));