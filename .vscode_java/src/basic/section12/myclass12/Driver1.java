package section12.myclass12;

public class Driver1 
{
    private Car car;

    public void setCar1(Car car) // 다형성 특징으로 인해 Car인터페이스를 구현하는 모든 클래스 타입의 객체 참조값을 받을 수 있음
    {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car; // 인자로 오는 변수의 타입(임의의 인터페이스 구현 클래스)에 따라,
                        // 그 타입 안에 있는 오버라이딩된 메서드가 자동으로 출력됨
                        // -> 즉 새로운 자동차 클래스가 나와도 Car 인터페이스를 구현하는 클래스라면,
                        // 다형성 특징으로 인해 인터페이스에서 자동으로 해당 클래스의 오버라이딩된 메서드를 출력함
                        // 결론은 Car 인터페이스를 수정하지 않고도 새로운 클래스를 사용할 수 있게 됨
    }

    public void drive1() 
    {
        System.out.println("자동차를 운전합니다.");
        
        car.startEngine1(); // 먼저 
        car.pressAccelerator1();
        car.offEngine1();
    }
}

// Driver` 는 멤버 변수로 `Car car` 를 가진다.
// `setCar(Car car)` : 멤버 변수에 자동차를 설정한다. 외부에서 누군가 이 메서드를 호출해주어야 `Driver` 는
// 새로운 자동차를 참조하거나 변경할 수 있다.
// `drive()` : `Car` 인터페이스가 제공하는 기능들을 통해 자동차를 운전한다.