package basic.section12.myclass12;

public class Model3Car1 implements Car
{
    @Override
    public void startEngine1() 
    {
        System.out.println("Model3Car.startEngine");
    }
    
    @Override
    public void offEngine1() 
    {
        System.out.println("Model3Car.offEngine");
    }
    
    @Override
    public void pressAccelerator1() 
    {
        System.out.println("Model3Car.pressAccelerator");
    }
}
