package middle2.section2.myclass2;

public class BioUnit 
{
    private String name;
    private int hp;
    
    public BioUnit(String n, int h) 
    {
        name = n;
        hp = h;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public int getHp() 
    {
        return hp;
    }
    
    @Override
    public String toString() 
    {
        return "BioUnit{" + "name='" + name + '\'' + ", hp=" + hp + '}';
    }    
}
