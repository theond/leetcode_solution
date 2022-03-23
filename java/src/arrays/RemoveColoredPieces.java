package arrays;

public class RemoveColoredPieces {
    public boolean winnerOfGame(String colors) {
        boolean result = false;
        int indexA = 1;
        int indexB = 1;

        while(indexA <colors.length() || indexB <colors.length()) {
            if (result) {
                //bob
                while(indexB <colors.length()) {
                    if(indexB >= colors.length() -1)
                        return result;
                    char b = colors.charAt(indexB);
                    char bPre = colors.charAt(indexB - 1);
                    char bSuffix = colors.charAt(indexB + 1);
                    indexB++;
                    if (b == 'B' && bPre == 'B' && bSuffix == 'B') {
                        result = false;
                        break;
                    }
                }
            } else {
                //alice
                while(indexA <colors.length()) {
                    if(indexA >= colors.length() -1)
                        return result;
                    char a = colors.charAt(indexA);
                    char aPre = colors.charAt(indexA - 1);
                    char aSuffix = colors.charAt(indexA + 1);
                    indexA++;
                    if (a == 'A' && aPre == 'A' && aSuffix == 'A') {
                        result = true;
                        break;
                    }
                }

            }
        }
        return result;
    }

    /* better solution
    当colors 中有一串连续的长度为 L_a的A时，Alice 可以删除中间的 L_a-2个A，而不能删除两边的2个A，B同理，AB删除不相互影响；当Alice的操作数大于Bob的操作数时，Alice获胜；否则，Bob获胜
    public boolean winnerOfGame(String colors) {
        int[] freq = {0, 0};
        char cur = 'C';
        int cnt = 0;
        for (int i = 0; i < colors.length(); i++) {
            char c = colors.charAt(i);
            if (c != cur) {
                cur = c;
                cnt = 1;
            } else {
                cnt += 1;
                if (cnt >= 3) {
                    freq[cur - 'A'] += 1;
                }
            }
        }
        return freq[0] > freq[1];
    }

     */
}
