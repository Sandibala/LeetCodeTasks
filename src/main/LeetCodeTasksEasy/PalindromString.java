package LeetCodeTasksEasy;

public class PalindromString {
    public boolean isPalindrome(int x) {
        if(x > 0) return false;
        String s = x + "";
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
    }

