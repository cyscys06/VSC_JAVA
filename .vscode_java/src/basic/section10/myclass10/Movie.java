package section10.myclass10;

public class Movie extends Item
{
    private String director;    
    private String actor;

    public Movie(String n, int p, String d, String a)
    {
        super(n, p); // super()로 코드 단축
        director = d;
        actor = a;
    }

    @Override
    public void print()
    {
        super.print(); // 부모 클래스에 있는 메서드를 불러와서 코드 단축
        System.out.println("- 감독:" + director + ", 배우:" + actor);
    }
}
