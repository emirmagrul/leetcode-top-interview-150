public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int wordLen = 0;
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                flag = true;
            }  else if (flag) {
                wordLen = 1;
                flag = false;
            } else {
                wordLen++;
            }
        }
        return wordLen;
    }
}
