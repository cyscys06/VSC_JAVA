package middle2.section1.myclass1;

public class Animal 
{
    private String name;
    private int size;

    public Animal(String n, int s)
    {
        name = n;
        size = s;
    }

    public String getName()
    {
        return name;
    }

    public int getSize()
    {
        return size;
    }

    public void sound()
    {
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString()
    {
        return "Animal{" + "name='" + name + '\'' + ", size=" + size + '}';
    }
}
