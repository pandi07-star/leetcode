class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int value=dividend/divisor;
        int acv = (int) value;
        return acv;

        
    }
}