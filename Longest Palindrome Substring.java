public int check(String A, int p1, int p2) {
        int size = A.length();

        while (p1 >= 0  &&  p2 < size) {
            if (A.charAt(p1)  ==  A.charAt(p2)) {
                p1--;
                p2++;
            }
        }

        return p2 - p1 - 1;    
    }

    public String longestPalindrome(String A) {
        int size = A.length();
        int maxlength = 1;
        int start = 0;

        for (int i = 0;  i < size;  i++) {
            int len1 = check(A, i, i);
            int len2 = check(A, i, i+1);
            int len = Math.max(len1, len2);
            if (len > maxlength) {
                maxlength = len;
                start = i - (len - 1) / 2;
            }
        }    

        return A.substring(start, start + maxlength);

    