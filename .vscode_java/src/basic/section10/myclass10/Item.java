package basic.section10.myclass10;

public class Item 
{
    protected String name; // 책 이름
    protected int price; // 책 가격
    
    // 아래 메서드들은 main() 메서드(상속관계 아닌 클래스)에서 사용해야 하므로 public으로 선언
    public Item(String n, int p)
    {
        name = n;
        price = p;
    }

    public int getPrice()
    {
        return price;
    }

    public void print() 
    {
        System.out.println("이름:" + name + ", 가격:" + price);
    }
}
