class Solution {
    public String[] findWords(String[] words) {

          String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();

            String currentRow;
            char firstChar = lower.charAt(0);

            if (row1.indexOf(firstChar) != -1) {
                currentRow = row1;
            } else if (row2.indexOf(firstChar) != -1) {
                currentRow = row2;
            } else {
                currentRow = row3;
            }

            boolean valid = true;

            for (char c : lower.toCharArray()) {
                if (currentRow.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
        
    }
}