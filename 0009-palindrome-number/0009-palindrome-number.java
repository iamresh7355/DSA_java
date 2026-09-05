class Solution {
    public boolean isPalindrome(int x) {
        int digit;
        int original=x;
        int sum=0;
        while(x>0){
          digit=  x%10;
          sum=sum*10+digit;
          x=x/10;
        }
        if(sum==original)
        return true;
        else
        return false;

    }
}