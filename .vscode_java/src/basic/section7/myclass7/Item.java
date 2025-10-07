package basic.section7.myclass7;

public class Item // 상품을 저장하는 클래스
{
    private String name; // 이름
    private int price; // 가격
    private int quantity; // 수량

    // 사고 흐름: 다른 패키지에서도 값을 사용할 수 있도록 하라 라는 말을 보고,
    // 속성값을 public으로 선언함 -> 규칙에 위배되긴 하지만 문제 조건이 있으므로 괜찮다 생각함
    // 수정: 속성값을 private로 선언하고 그 private 속성을 가져오는 메서드를 public으로 하기
    // 규칙에 위배되지도 않고 문제 조건도 만족하게됨

    // 정리: 데이터는 무조건 숨기고, 데이터를 드러내는 부분을 public 메서드로 만든다.

    public Item(String n, int p, int q)
    {
        name = n;
        price = p;
        quantity = q;
    }
    
    // 단순히 이름, (수량 * 가격)을 출력해도 되지만 외부에서 메서드만 사용하는 방식으로 편하게 할수도 있음
    public String getName()
    {
        return name;
    }
    public int getTotalPrice()
    {
        return price * quantity;
    }
}
