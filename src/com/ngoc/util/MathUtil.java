
package com.ngoc.util;

//class này chứa những hàm toán học, tính toán gì dó, giúp cho mọi nơi khác
public class MathUtil {
    
    //tính n! - tính dưới 15! thôi nha
    public static long computeFactorial(int n) {
        
        //ham se nem ra ngoai le neu ban dua vao n ca chon
        if (n < 0 || n > 15)
            throw new IllegalArgumentException("Invalid argument. n must be >= 0 and <= 15");
        
        //choi de quy cho no pro :)
        if (n == 0 || n == 1)
            return 1;
        
        //bat dau cac lenh con lai o day
        //dua nao viet else tru diem nha con
        return n * computeFactorial(n - 1);
    }
    
}

//nho Jenkins xac nhan code chinh sua co in nhu ngay xua hay ko?
//Regression dc thuc thi boi Jenkins, test lai nhu gi da tung test
//de confirm chat luong sau khi bi thay doi
