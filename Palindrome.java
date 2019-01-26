class Palindrome {
    public boolean isPalindrome(int x) {
        if( x >= 0 && x < 10 )
            return true;
        if( x < 0 || x % 10 == 0)
            return false;
        int pal = x;
        int result = 0;
        while (x != 0)
        {
            result = (result * 10) + (x % 10);
            x = x / 10;
        }
        if(result==pal)
            return true;
        return false;
    }
}
