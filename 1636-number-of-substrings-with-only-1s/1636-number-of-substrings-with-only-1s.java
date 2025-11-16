class Solution {
    private static final long MOD = 1_000_000_007L;
    private static final long INV2 = 500000004L; // modular inverse of 2 mod MOD
    public int numSub(String s) {
        long ans = 0L;
        long count = 0L;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            } else {
                if (count > 0) {
                    long a = count % MOD;
                    long b = (count + 1) % MOD;
                    long contribution = ( (a * b) % MOD * INV2 ) % MOD;
                    ans = (ans + contribution) % MOD;
                    count = 0;
                }
            }
        }
        // add last segment if string ends with '1'
        if (count > 0) {
            long a = count % MOD;
            long b = (count + 1) % MOD;
            long contribution = ( (a * b) % MOD * INV2 ) % MOD;
            ans = (ans + contribution) % MOD;
        }
        return (int) ans;
    }
}