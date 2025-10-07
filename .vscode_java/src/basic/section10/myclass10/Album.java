package basic.section10.myclass10;

public class Album extends Item
{
    private String artist;
    
    public Album(String n, int p, String a)
    {
        super(n, p); // super()로 코드 단축
        artist = a;
    }

    @Override
    public void print()
    {
        super.print(); // 부모 클래스에 있는 메서드를 불러와서 코드 단축
        System.out.println("- 아티스트" + artist);
    }
}
