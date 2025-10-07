package middle1.section1.myclass1;

public class ImmutableMyDate 
{
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) 
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate changeYear(int y) // 새 객체 자체를 반환하는 것이므로 반환형 ImmutableMyDate
    {
        return new ImmutableMyDate(y, month, day); 
        // 생성자 매개변수 규칙 따르면서 year만 바꾼 새로 만들어진 객체를 반환
    }

    public ImmutableMyDate changeMonth(int m)
    {
        return new ImmutableMyDate(year, m, day);
    }

    public ImmutableMyDate changeDay(int d)
    {
        return new ImmutableMyDate(year, month, d);
    }
    
    @Override
    public String toString() 
    {
        return year + "-" + month + "-" + day;
    }


}
