package section5.myclass5;

public class Book 
{
    public String title; // 제목
    public String author; // 작가
    public int page; // 페이지 수

    // 메서드
    public Book() // 사용자가 직접 만든 기본 생성자
    {
        this("", "", 0); // 중복 코드 줄이기
    }

    public Book(String t, String a) // 제목, 작가만 받는 생성자
    {
        this(t, a, 0); // this()로 중복 줄이기
    }

    public Book(String t, String a, int p) // 3개 다 받는 생성자
    {
        title = t;
        author = a;
        page = p;
    }

    public void displayInfo()
    {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
