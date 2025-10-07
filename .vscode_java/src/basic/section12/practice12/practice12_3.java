package basic.section12.practice12;

import basic.section12.myclass12.Car;
import basic.section12.myclass12.Driver1;
import basic.section12.myclass12.K3Car1;
import basic.section12.myclass12.Model3Car1;

public class practice12_3 
{
    public static void main(String[] args) 
    {
        Driver1 driver = new Driver1(); // Driver1 객체 생성

        //차량 선택(k3)
        Car k3Car = new K3Car1(); // K3Car 객체 생성
        driver.setCar1(k3Car); // 객체 참조값을 setCar1에 복사
                               // -> 내부에 있는 K3Car1 타입 멤버변수에 참조값이 전달
                               // K3Car 클래스가 Car 인터페이스를 구현하기 때문에 가능
        driver.drive1();

        //차량 변경(k3 -> model3)
        Car model3Car = new Model3Car1();
        driver.setCar1(model3Car);
        driver.drive1();
    }
}
