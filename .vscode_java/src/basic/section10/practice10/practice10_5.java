package basic.section10.practice10;

import basic.section10.myclass10.ClassC;

public class practice10_5 
{
    public static void main(String[] args)
    {
        ClassC classc = new ClassC();
        // 1. 클래스 C의 기본 생성자를 호출
        // 2. 클래스 C의 기본 생성자가 super(10, 20)을 통해 클래스B의 사용자 지정 생성자를 호출
        // 3. 클래스 B의 생성자가 super()를 통해 클래스A의 기본 생성자를 호출
        // 4. 클래스 A의 기본생성자를 통해 클래스 A의 객체 생성
        // 5. 다시 클래스 B로 내려와서 클래스 B의 객체 생성
        // 6. 다시 클래스 C로 내려와서 클래스 C의 객체 생성
        // -> 상속 관계에서의 생성자 호출은 결과로 봤을때 부모에서 자식으로 내려가면서 진행됨
        // 자식 클래스의 생성자 '첫줄에' 반드시 부모 클래스의 생성자를 의미하는 super()를 호출해야 함
        // 단 부모 클래스의 생성자가 기본 생성자인 경우 생략이 가능함

        System.out.println(classc); // 경고메세지 지우기용
    }    
}
