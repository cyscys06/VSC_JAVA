package basic.section12.myclass12;

public class K3Car1 implements Car
{
    @Override
    public void startEngine1()
    {
        System.out.println("K3Car.startEngine");
    }    

    @Override
    public void offEngine1() 
    {
    System.out.println("K3Car.offEngine");
    }
    
    @Override
    public void pressAccelerator1() 
    {
    System.out.println("K3Car.pressAccelerator");
    }
}
