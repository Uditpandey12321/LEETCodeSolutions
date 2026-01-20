class Solution {
    public int myAtoi(String s) {
         int sign = 1, i = 0, num = 0; 
        if (s.length() == 0) return 0;    
        // skip all leading spaces
        while (i < s.length() && s.charAt(i) == ' ') i++;
        // check for +, - sign after spaces have been dealt with
        // flip sign if - is present
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        // now keep going till we encounter digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            int bound = Integer.MAX_VALUE / 10;
            // if num is over bound -> return max/min depending upon the sign
            // also consider if num is bound as follows : 
            // MAX 2147483647, bound is 214748364, num is 214748364_
            // num is equal to bound right now, now if _ exceeds 7 return max/min
            // if it does not exceed 7 => still within range
            // instead of 7, we can do MAX % 10 for readability
            if(num > bound || (num == bound && digit > Integer.MAX_VALUE % 10)) 
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            num = num * 10 + digit;
            i++;
        }
        return num * sign;
    }
}