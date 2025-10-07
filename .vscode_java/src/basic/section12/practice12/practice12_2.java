package basic.section12.practice12;

import basic.section12.myclass12.*;

public class practice12_2 
{
    public static void main(String[] args) 
    {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();
        
        //추가
        Model3Car model3Car = new Model3Car();
        
        driver.setK3Car(null); // k3 set을 해제하고
        driver.setModel3Car(model3Car); // model3를 set하기
        driver.drive(); // 이제 model3의 메서드가 출력됨
    }
}
