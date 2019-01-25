class Reverse {
    public int reverse(int x) {
        boolean isNegative = x<0?true:false;
        if(isNegative)
            x = x * -1;
        int reverse = 0; 
        while(x > 0)
        { 
            reverse = (reverse * 10) + (x % 10); 
            x = x / 10; 
        }
        return isNegative == true? reverse*-1 : reverse;
    }
}
