package basic.section4.myclass4;

public class Rectangle 
{
    // 속성
    public int width; // 너비
    public int height; // 높이
    public int area; // 넓이
    public int perimeter; // 둘레
    public boolean square; // 정사각형 여부

    // 기능
    public int calculateArea() // 클래스 내부 메서드는 지금은 내부 값만 사용하므로 따로 인자 안받아도 됨 
    {
        return width * height; // 코드 간략화
    }

    public int calculatePerimeter()
    {
        return 2 * (width + height); // 코드 간략화 
    }

    public boolean isSquare()
    {
        return width == height; // w == h 자체가 조건식이므로 둘이 같으면 정사각형(true)이고, 아니면 직사각형(false)임
    }

    // 같은 클래스 내부에 있는 멤버 변수만 사용함(즉 외부 데이터 없이도 데이터 가공이 가능함. 물론 선택에 따라 외부 데이터를 받을 수도 있음)
}
