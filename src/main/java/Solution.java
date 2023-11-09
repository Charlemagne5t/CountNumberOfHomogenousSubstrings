public class Solution {
    public int countHomogenous(String s) {
        int[] memo = new int[s.length()];
        int modulo = 1_000_000_007;
        int result = 0;
        int currentLengthOfHomogenous = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                currentLengthOfHomogenous++;
            } else {
                if (memo[currentLengthOfHomogenous] == 0) {
                    memo[currentLengthOfHomogenous] = count(currentLengthOfHomogenous);
                }
                result = (result + memo[currentLengthOfHomogenous]) % modulo;
                currentLengthOfHomogenous = 1;
            }
        }
        result = (result + count(currentLengthOfHomogenous)) % modulo;
        return result % modulo;
    }
    private int count(int n){
        int modulo = 1_000_000_007;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (sum + i) % modulo;
        }

        return sum% modulo;
    }

}