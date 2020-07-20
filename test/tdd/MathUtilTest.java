/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import com.ngoc.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jiahn
 */
public class MathUtilTest {
    
    public MathUtilTest() {
        
    }
    
    @Test
        public void testSuccessfulCases() {
        //day la ham dung de test cac dau vao hop le cua ham cF()
        //vi du cF(5), cF(6),... minh se goi o day
        //xem actual cua chung tra ve co khop voi expected hay ko?
        //tuyu nhien minh ko choi tro sout()
        //ma de cho .jar cua add vao va tu luan ket qua so sanhß
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(24, MathUtil.computeFactorial(4));
        assertEquals(120, MathUtil.computeFactorial(5));
        assertEquals(720, MathUtil.computeFactorial(6));
    
        }
        
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //ham nay dung de test truong hop dua data ca chon
        //vi du -5! thi cf(-5) tinh the me nao dc :))
        //ko tinh dc chu ko tra ve -1, noi rang dau vao vo li
        //vi xet cho cung -1 dc xem la 1 value
        //tinh huong dau vao ca chon, ta se nem ra ngoai le nao do
        //ma Exception noi chung ko phai 1 value
        //no dai dien mot cai bat thuong nao do
        //ma bat thuong thi ko the so sanh dc
        //vay ma ham tra ve ngoai le thi ko the return 
        //nen ko xai dc ham assertEquals(..., ...)
        //ta xai chieu khac, chi hung ngoai le, coi no co dung ngoai le do ko?
        MathUtil.computeFactorial(-5);
    }
}

//Libraries -> add jar -> C:\Program Files\NetBeans 8.2\platform\modules\ext\junit-4.12.jar
///////////////////////// C:\Program Files\NetBeans 8.2\platform\modules\ext\hamcrest-core-1.3.jar

//mau xanh: neu tat ca case deu dung
//mau do: neu chi mot thang do

//tum lai:
//du code co do hay xanh
//thi:
//clean and build luon chay
//vi: 
//nhiem vu goc ban dau: code ko co error ve cu phap, phai ra .war, .jar

//minh nang cap: code ban con mau do, tuc la chay ko nhu ki vong
//to disable Clean and Built nha, de code ban mau xanh
//hoac xoa mia file test di

//nho 2 con so dac biet trong cuoc doi cua ban
////neu ban xai NetBeans 8: 1005
///////<target depends="init,compile,test,-pre-pre-jar,-pre-jar
////neu ban xai NetBeans 10 tro len: 1204
