class Solution {
    public String reformatDate(String date) {
        HashMap<String, String> h = new HashMap<>();
        
        h.put("Jan", "01");
        h.put("Feb", "02");
        h.put("Mar", "03");
        h.put("Apr", "04");
        h.put("May", "05");
        h.put("Jun", "06");
        h.put("Jul", "07");
        h.put("Aug", "08");
        h.put("Sep", "09");
        h.put("Oct", "10");
        h.put("Nov", "11");
        h.put("Dec", "12");
        
        String [] arr = date.split(" ");
        String ans="";
        int i=0;
        String year = arr[2], month = h.get(arr[1]);
        for(i=0; i<arr[0].length(); i++){
            if(arr[0].charAt(i)>='0' && arr[0].charAt(i)<='9') continue;
            else break;
        }
        String d = arr[0].substring(0,i);
        if(d.length()<2) d="0"+d;
        return (year+"-"+month+"-"+d);
        
    }
}