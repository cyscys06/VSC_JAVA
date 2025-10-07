package basic.section10.myclass10;

public class Child1 extends Parent1 
{
    public void call() 
    {
        // 부모 클래스의 속성을 가져올 수 있음
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지면 접근 가능
        //defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
        //privateValue = 1; // 접근 불가, 컴파일 오류
        
        publicMethod();
        protectedMethod(); // 상속 관계 or 같은 패키지면 접근 가능
        //defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); // 접근 불가, 컴파일 오류
        
        printParent();
    }
}