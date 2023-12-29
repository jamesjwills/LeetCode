class Solution {

    public int maxScore = 0;
    public int zeroCount = 0;
    public int onesCount = 0;
    public int totalOnes;

    public int countOnes(String s) {
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }
        return totalOnes;
    }

    public void updateCurrentScore() {
        int currentScore = zeroCount + totalOnes - onesCount;
        if (currentScore > maxScore) {
            maxScore = currentScore;
        }
    }

    public int maxScore(String s) {
        countOnes(s);
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            } else {
                onesCount++;
            }
            updateCurrentScore();
        }
        return maxScore;
    }

    public static void main(String args[]) {
        Solution sln = new Solution();
        String s = args[0];
        System.out.println(sln.maxScore(s));
    }
}