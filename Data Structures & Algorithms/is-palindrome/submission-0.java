class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newS = new StringBuilder();

        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newS.append(Character.toLowerCase(c));
            }
        }

        return newS.toString().equals(newS.reverse().toString());
    }
}
