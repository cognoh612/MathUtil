
package com.ngoc.util;

//class này chứa những hàm toán học, tính toán gì dó, giúp cho mọi nơi khác
public class MathUtil {
    
    //tính n! - tính dưới 15! thôi nha
    public static long computeFactorial(int n) {
        
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
