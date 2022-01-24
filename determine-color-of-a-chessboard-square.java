class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 97;
        int y = Character.getNumericValue(coordinates.charAt(1));
        if(x%2==0 && y%2==0) return true;
        if(x%2==1 && y%2==1) return true;
        return false;
    }
}