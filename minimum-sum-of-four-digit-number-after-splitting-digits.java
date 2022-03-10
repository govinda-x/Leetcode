class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> a = new ArrayList<>();
        while(num!=0){
            a.add(num%10);
            num/=10;
        }
        Collections.sort(a);
        return a.get(0)*10+a.get(3) + a.get(1)*10+a.get(2);
    }
}