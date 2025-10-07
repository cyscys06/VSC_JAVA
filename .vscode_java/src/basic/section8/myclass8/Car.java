package section8.myclass8;

public class Car 
{
    private String name; // 차량 이름
    private static int count; // 구매한 차량 수
    
    public Car(String n)
    {
        name = n;
        System.out.println("차량 구입, 이름: " + name);
        count++;
    }

    public static void showTotalCars()
    {
        System.out.println("구매한 차량 수: " + count);
    }
}
