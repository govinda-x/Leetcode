class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] a = Arrays.copyOf(arr, n);
        Arrays.sort(a);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(a[i])){
                map.put(a[i], map.size()+1);
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}