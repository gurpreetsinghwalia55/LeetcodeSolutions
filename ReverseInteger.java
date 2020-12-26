class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0){
            int pop = x % 10;
            x = x / 10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse * 10;
            reverse += (pop);
            
        }
        return reverse;
    }
}

//N = 2^31 - 1 = a*10 + 7 where a = N/10
//M = -2^31 = a'*10 - 8 where a=M/10
