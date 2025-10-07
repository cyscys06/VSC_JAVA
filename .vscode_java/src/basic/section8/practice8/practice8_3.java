package basic.section8.practice8;

import static basic.section8.myclass8.DecoData.*; // 클래스의 정적 메서드들을 불러오기
import basic.section8.myclass8.DecoData; // 클래스의 인스턴스 메서드들을 불러오기

public class practice8_3
{
    public static void main(String[] args) 
    {
        System.out.println("1.정적 호출");
        staticCall(); // 정적 메서드는 클래스 자체 메서드이므로,
                      // 해당 클래스를 import 하기만 하면 메서드 이름만 써서 사용 가능
        // 위에서 클래스의 정적 메서드, 변수들을 import 했으므로 여기서는 메서드 이름만 써도 인식 됨
        
        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData(); 
        // 인스턴스 변수는 새 객체가 만들어질때마다 새 변수가 할당되므로, 
        // 서로 다른 객체의 인스턴스 변수끼리는 서로 구분 해야함

        data1.instanceCall(); // 인스턴스 메서드는 객체를 통해 사용

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}