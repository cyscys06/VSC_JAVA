package middle2.section2.myclass2;

public class Shuttle<T extends BioUnit> 
{
    private T Unit;

    public void in(T u)
    {
        Unit = u;
    }

    public T out()
    {
        return Unit;
    }

    public void showInfo()
    {
        System.out.println("이름: " + Unit.getName() + ", HP: " + Unit.getName());
    }
}
