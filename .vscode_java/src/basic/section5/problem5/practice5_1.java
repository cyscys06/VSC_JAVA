package basic.section5.problem5;

import basic.section5.myclass5.Book;

public class practice5_1 
{
    public static void main(String[] args)
    {
        Book book1 = new Book(); // 사용자 정의 기본 생성자
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "Seo"); // 2개만받는 생성자
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "kim", 700); // 3개다 받는 생성자
        book3.displayInfo();
    }
}
