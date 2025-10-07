package basic.section10.myclass10;

public class ClassB extends ClassA
{
    public ClassB(int a)
    {
        super(); // 부모 생성자를 호출하려면(물론 부모 클래스에 생성자가 존재할 때)
                 // super()로 호출하기
        System.out.println("ClassB 생성자 a=" + a); 
    }    

    public ClassB(int a, int b)
    {
        super(); // 이때 이 super()는 매개변수가 없는, 부모 클래스의 기본 생성자를 의미하므로 생략 가능함
                 // (부모 클래스의 기본 생성자는 생략 가능)
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
