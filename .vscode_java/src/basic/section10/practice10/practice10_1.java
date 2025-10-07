package section10.practice10;

import section10.myclass10.ElectricCar;
import section10.myclass10.GasCar;
// 자식 클래스들 불러오기
// Car 클래스의 기능은 이미 자식 클래스가 상속받아서 갖고 있으므로 불러올 필요 없음

public class practice10_1 
{
    public static void main(String[] args)
    {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
    
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }    
}
