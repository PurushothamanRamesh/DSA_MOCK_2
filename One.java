public class One {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int left = 0;
        int right = x;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if ((long) mid * mid <= x && (long) (mid + 1) * (mid + 1) > x) {
                return mid;
            }
            
            if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return right;
    }
    
    public static void main(String[] args) {
        int x = 4;
        int result = mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
        
        x = 8;
        result = mySqrt(x);
        System.out.println("Square root of " + x + " is: " + result);
    }
}
