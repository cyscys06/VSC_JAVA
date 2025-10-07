package middle2.section1.myclass1;

public class Cat extends Animal
{
    public Cat(String n, int s)
    {
        super(n, s);
    }

    @Override
    public void sound()
    {
        System.out.println("냐옹");
    }    
}
