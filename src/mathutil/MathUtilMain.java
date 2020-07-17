
package mathutil;

import static com.ngoc.util.MathUtil.computeFactorial;

public class MathUtilMain {

    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));
        
        System.out.println("Cai nay tui muon test thu vu git ne");
        
        //doan code tren chinh la test ham bang tay - manual test
        //tuc la: chuan bi data de test, chinh la so 5, dau vao
        //ta goi ham cF(5)
        //ta chay ham, ta xem no in ra so may (actual value)
        //truoc do ta phai tu tinh bang tay 5!
        //cai ta ki vong ham phai tra ve con so nay, 120
        //120 la cai ta hy vong ham se tra ve cho 5! (expected value)
        
        //ham chay xong, ta so sanh kqua giua expected va actual
        //neu khop nhau, thi ham xu li dung
        //neu ko khop, thi ham sai, hoac minh ki vong sai
        
        //lam bang tay thi phai so sanh bang mat de luan kqua dung sai cua ham
        
        //expected: 720
        System.out.println("6! = " + computeFactorial(6));
        
        //expected: 1
        System.out.println("0! = " + computeFactorial(0));
        
        //expected: chui ca chon
        //expected: may dua dau vao ca chon, tao chui may bang viec
        //nem ra ngoai le exception, vi dech tinh dc do dau vao ca chon
        System.out.println("-5! = " + computeFactorial(-5));
        
    }
    
    //nhin bang mat, nhin kqua on nhung chua hay
    //giang ho ho tro them cac bo thu vien giup ta test ham bang tay mot cach
    //hieu qua hon qua hieu ung mau sac, va chung tu so sanh dum ta
    //tool nay se bao dum ta thong qua 2 trang thai duy nhat
    ////mau do: toang, actual ko khop voi expected
    ////mau xanh: ngon, khop roi do
    //thu vien nay mang ten chung: Unit Test
    //hoac JUniTest
    
}
