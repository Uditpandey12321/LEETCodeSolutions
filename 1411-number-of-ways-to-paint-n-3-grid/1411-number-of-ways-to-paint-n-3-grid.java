class Solution {
    public int numOfWays(int n) {
        final int mod = 1_000_000_007;
        long A = 6, B = 6;
        for(int i=2;i<=n;i++){
            long newA = (2*A+2 * B) % mod;
            long newB = (2*A+3 * B) % mod;
            A = newA;
            B = newB;
        }
        return (int) ((A+B) % mod);
    }
}