package middle1.section5.myclass5;

public enum Grade 
{
    BASIC(10), GOLD(20), DIAMOND(30);
    
    private final int discountPercent;

    Grade(int d)
    {
        discountPercent = d;
    }

    public int getdisCountPercent()
    {
        return discountPercent;
    }

    // 등급별로 할인율 구할수 있는 메서드로 변경
    // 열거 상수가 메서드 호출만 하면 됨
    public int discount(int price)
    {
        return price * discountPercent / 100;
    }
}
