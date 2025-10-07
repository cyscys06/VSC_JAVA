package middle1.section8.problem8;

import middle1.section8.myclass8.OuterClass3;

public class problem8_3 
{
    public static void main(String[] args) 
    {
        OuterClass3 outerClass3 = new OuterClass3();

        outerClass3.myMethod(); 
        // OuterClass3에 속한 메서드 myMethod를 호출하면, 
        // myMethod 안에 있는 지역클래스 LocalClass의 메서드 hello가 호출됨
        // LocalClass 객체를 myMethod 안에서 미리 선언해놓고 호출했으므로 그 객체를 통해 호출 가능
    }    
}
