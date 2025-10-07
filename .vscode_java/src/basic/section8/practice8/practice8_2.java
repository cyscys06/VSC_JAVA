package section8.practice8;

import section8.myclass8.Data;

public class practice8_2 
{
    public static void main(String[] args) // 0. main() 메서드가 실행
    {
        System.out.println("main start");
        method1(); // 1. 메서드1이 실행
                   // 2. 메서드2가 실행
                   // 이때 메서드2의 지역변수 data2가 메서드1의 data1 지역 변수의 참조값을 복사받음
                   // 이 상태에서 data1, data2는 동일한 메모리 영역을 가리킴
                   // 메서드2가 종료되고 메서드1도 종료되면 할당된 메모리 영역을 참조하는 변수가 하나도 없음
                   // 이럴때 GC가 발동되어 아무도 참조하지 않는 메모리 영역을 제거하는 것
                   
        System.out.println("main end");
    }
    
    static void method1() 
    {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }
    
    static void method2(Data data2) 
    {
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }    
}
