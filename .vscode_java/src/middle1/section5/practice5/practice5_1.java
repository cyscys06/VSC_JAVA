package middle1.section5.practice5;

import middle1.section5.myclass5.Grade;

public class practice5_1 
{
    public static void main(String[] args) 
    {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());
        
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }
    
    private static String refValue(Object grade) 
    {
        return Integer.toHexString(System.identityHashCode(grade));
        // System.identityHashCode(): 자바가 관리하는 객체 참조값 반환
        // Integer.toHexString(): 숫자를 16진수로 변환
    }
}
