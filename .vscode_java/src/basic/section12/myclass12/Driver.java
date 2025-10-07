package section12.myclass12;

public class Driver 
{
    private K3Car k3; // K3Car 클래스 메서드 전용 멤버변수 
                      // K3Car 클래스 객체를 Driver에 연결해야지만 K3Car 메서드를 사용할 수 있게 해줌
                      // -> 즉 K3Car를 Driver 클래스에 의존하게 하는 것
    private Model3Car model3Car;
    
    public void setK3Car(K3Car k3Car) 
    {
        k3 = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) 
    {
        this.model3Car = model3Car;
    }

    public void drive() 
    {
        System.out.println("자동차를 운전합니다.");
        if (k3 != null) // 운전자가 k3 set 했으면
        {
            k3.startEngine();
            k3.pressAccelerator();
            k3.offEngine();
        } 
        else if (model3Car != null) // 운전자가 model3 set 했으면
        {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
