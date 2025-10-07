package section10.practice10;

import section10.myclass10.*;

public class practice10_2 
{
    public static void main(String[] args) 
    {
        ElectricCar electricCar = new ElectricCar(); 
        // 전기차만 오버라이드된 메서드 때문에 출력값이 다름
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();
        
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}