package basic.section10.myclass10;

public class ElectricCar extends Car
{
    @Override // 상위 클래스의 메서드를 오버라이딩 했음을 나타내는 표시이다.
              // 애노테이션이라 읽고, 프로그램이 읽을 수 있는 특별한 주석이라 생각하면됨
    public void move()
    {
        System.out.println("전기차가 빠르게 이동합니다.");
    }

    public void charge()
    {
        System.out.println("충전합니다."); // 이 클래스만 할 수 있는 행동
    }    
}
