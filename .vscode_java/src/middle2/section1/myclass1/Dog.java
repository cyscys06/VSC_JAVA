package middle2.section1.myclass1;

public class Dog extends Animal
{   
    public Dog(String n, int s)
    {
        super(n, s);
    }

    @Override
    public void sound()
    {
        System.out.println("멍멍");
    }
}
