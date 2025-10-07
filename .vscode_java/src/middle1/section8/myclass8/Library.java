package middle1.section8.myclass8;

public class Library 
{
    private Book[] books; // 책 저장하는 배열을 클래스 멤버로 선언만 해놓기
    int count = 0; // 책 개수만큼 카운트 증가하는 멤버도 클래스 멤버로 선언해놓기

    public Library(int n)
    {
        books = new Book[n]; // 만들어논 배열의 크기를 n으로 지정
    }

    public void addBook(String t, String a)
    {
        if (count < books.length)
        {
            books[count] = new Book(t, a);
            count++;
        }
        else
        {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks()
    {
        for (Book b : books)
        {
            System.out.println("도서 제목: " + b.title + ", 저자: " + b.author);
        }
    }

    private class Book
    {
        private String title;
        private String author;

        public Book(String t, String a)
        {
            title = t;
            author = a;
        }
    }
}
