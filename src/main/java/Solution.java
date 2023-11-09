public class Solution {
    public int countHomogenous(String s) {
        return dfs(s, 0);
    }
    public int dfs(String s, int i){
        int modulo = 1_000_000_007;
        if(i == s.length()){
            return 0;
        }
        int result = 0;
        if(i != 0 && s.charAt(i - 1) == s.charAt(i)){
            result += 1 + dfs(s, i + 1) % modulo;
        }
        result += 1 + dfs(s, i + 1) % modulo;

        return result;

    }
}