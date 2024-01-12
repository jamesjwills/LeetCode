//palindrome number

public class Solution {
    
    public boolean isPalindrome(int N) {
        int rev = 0;
        int inputNum = N;

        while (inputNum >= 1) {
            rev = rev*10 + inputNum%10;
            inputNum/=10;
        }
        
        return N == rev;
    }

    public static void main(String[] args) {
        Solution sln = new Solution();
        boolean result = sln.isPalindrome(Integer.parseInt(args[0]));
        System.out.println(result);
        
         
    }
    
}
