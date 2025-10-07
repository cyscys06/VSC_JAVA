package middle2.section1.myclass1;

public class Container<T>
{
    private T value;

    public void setItem(T v)
    {
        value = v;
    }

    public T getItem()
    {
        return value;
    }

    public boolean isEmpty()
    {
        if (value == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
