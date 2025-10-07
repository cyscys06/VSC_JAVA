package section10.myclass10;

public class GasCar extends Car // Car라는 부모 클래스를 상속받는 GasCar라는 자식 클래스 만듦
{
    public void fillUp()
    {
        System.out.println("기름을 주유합니다."); // 이 클래스만 할 수 있는 행동
    }
}
