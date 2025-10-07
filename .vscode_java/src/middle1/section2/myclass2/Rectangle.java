package middle1.section2.myclass2;

public class Rectangle
{
    private int width;
    private int height;

    public Rectangle(int w, int h)
    {
        width = w;
        height = h;
    }
    
    @Override
    public String toString() // toString()은 매개변수 안받음
    {
        return "Rectangle{width=" + width + "height=" + height + "}";
    }

    @Override
    public boolean equals(Object o) // Object 타입의 매개변수 1개 필요
    {
        if (o == null || getClass() != o.getClass()) // 매개변수가 null 이거나 클래스 타입 서로 다르면
        {
            return false;
        }
        Rectangle rectangle = (Rectangle) o; // Rectangle 클래스의 멤버변수 이용을 위한 다운캐스팅
        
        return width == rectangle.width && height == rectangle.height;
    }
}
