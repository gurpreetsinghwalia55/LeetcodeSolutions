class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int originalNumber = x;
        int number = 0;
        while(x != 0){
            number = (number * 10) + (x%10);
            x = x/10;
        }
        return (number == originalNumber);
    }
}
