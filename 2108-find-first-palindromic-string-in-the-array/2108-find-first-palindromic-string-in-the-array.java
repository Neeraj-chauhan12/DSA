class Solution {
    public String firstPalindrome(String[] words) {

        for(int i=0; i<words.length; i++){
            String ch=words[i];
            String rev=new StringBuilder(ch).reverse().toString();
            if(ch.equals(rev)){
                return ch;
            }
        }
        return "";
    }
}