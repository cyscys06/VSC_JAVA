package basic.section12.practice12;

import basic.section12.myclass12.*;

public class practice12_1 
{
    public static void main(String[] args) 
    {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car); // 인자로 받은 변수의 참조값을 Driver 클래스 안의 k3 변수에 할당
                                // 이로써 k3Car 변수가 Driver 클래스에 의존됨
        driver.drive();
    }   
}
