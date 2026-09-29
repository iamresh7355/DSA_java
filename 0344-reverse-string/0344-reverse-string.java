class Solution {
    public void reverseString(char[] s) {
    /*  String  rev= "";
      char [] sArr = s.toCharArray();
       Arrays.sort(sArr);
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i); 
    }
             return rev;
    }
}  */
int left = 0;
int right = s.length-1;
for(;left <right;left++,right--) {
    char temp = s[left];
    s[left] = s[right];
    s[right] = temp;
}
}
}