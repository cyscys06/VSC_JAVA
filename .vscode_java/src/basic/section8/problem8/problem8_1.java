package section8.problem8;

import section8.myclass8.Car;
import static section8.myclass8.Car.showTotalCars;

public class problem8_1 
{
    public static void main(String[] args) 
    {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        showTotalCars(); //구매한 차량 수를 출력하는 static 메서드

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
