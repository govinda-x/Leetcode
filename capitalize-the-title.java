class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String [] arr = title.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].length()<=2) continue;
            else{
                StringBuilder s = new StringBuilder(arr[i]);
                String replace = Character.toString(arr[i].charAt(0));
                arr[i] = s.replace(0,1,replace.toUpperCase()).toString();
            }
            
        }
        title = "";
        for(String i : arr){
            title = title + i + " ";
        }
        return title.substring(0, title.length()-1);
    }
}