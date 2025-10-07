package basic.section10.myclass10;

public class Book extends Item
{
    private String author;
    private int isbn;

    
    public Book(String n, int p, String a, int i)
    {
        super(n, p); // super()로 코드 단축
        author = a;
        isbn = i;
    }

    @Override
    public void print()
    {
        super.print(); // 부모 클래스에 있는 메서드를 불러와서 코드 단축
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
