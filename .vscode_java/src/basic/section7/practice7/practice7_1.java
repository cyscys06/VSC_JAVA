package basic.section7.practice7;

import basic.section7.myclass7.AccessData;

public class practice7_1 
{
    public static void main(String[] args) 
    {
        AccessData data = new AccessData();
        
        // public은 그냥 호출 가능
        data.publicField = 1;
        data.publicMethod();
        
        // default이므로 다른 패키지에서 호출 불가
        // data.defaultField = 2;
        // data.defaultMethod();
        
        // private이므로 다른 클래스에서 호출 불가
        // data.privateField = 3;
        // data.privateMethod();
        
        data.innerAccess(); // 같은 클래스에 속한 메서드를 통해 접근이 제한된 멤버 변수들에 접근할 수 있음
    }
}