class Solution {
     public int[] nextGreaterElement(int[] a, int[] b) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    boolean bl = true;
                    for(int k = j + 1; k < b.length; k++){
                        if(a[i] < b[k]){
                            bl = false;
                            arr[i] = b[k];
                            break;
                        }
                    }
                    if(bl) arr[i] = -1;
                    break;
                }
            }
        }
        return arr;
    }
}