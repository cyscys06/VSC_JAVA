package section10.myclass10;

public class Child2 extends Parent2
{
    public String value = "child";
    
    @Override
    public void hello() // 자식 클래스를 기준으로 오버라이드된 hello 메서드
    {
        System.out.println("Child.hello");
    }
    
    public void call() 
    {
        System.out.println("this value = " + value); // 여기서의 value는 자식 클래스
        System.out.println("super value = " + super.value); // 여기서의 value는 부모 클래스
        hello(); // 자식 클래스
        super.hello(); // 부모 클래스
    }
}
