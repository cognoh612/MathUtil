
package com.ngoc.util;

//class này chứa những hàm toán học, tính toán gì dó, giúp cho mọi nơi khác
public class MathUtil {
    
    //tính n! - tính dưới 15! thôi nha
    public static long computeFactorial(int n) {
        
        //ham se nem ra ngoai le neu ban dua vao n ca chon
        if (n < 0 || n > 15)
            throw new IllegalArgumentException("Invalid argument. n must be >= 0 and <= 15");
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
