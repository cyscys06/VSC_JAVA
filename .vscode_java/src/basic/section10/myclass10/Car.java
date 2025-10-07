package section10.myclass10;

public class Car 
{
    public void move() 
    {
        System.out.println("차를 이동합니다."); 
        // 추상적인 기능은 부모 클래스에 넣어놓고 자식 클래스가 상속받게 하기
    }
    
    // 모든 자식 클래스에 동일한 기능을 추가하려면 부모 클래스에 메서드 추가만 해주면 됨
    public void openDoor() 
    {
        System.out.println("문을 엽니다.");
    }
    // 이 메서드는 자식 클래스에서 모두 사용 가능
}
