class Solution {
    public String reversePrefix(String word, char ch) {
        
         int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= index; i++) {
            sb.append(word.charAt(i));
        }

        sb.reverse();

        sb.append(word.substring(index + 1));

        return sb.toString();
    }
}