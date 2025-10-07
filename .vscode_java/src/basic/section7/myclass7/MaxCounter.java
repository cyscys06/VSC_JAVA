package section7.myclass7;

public class MaxCounter 
{
    private int count;
    private int max;

    public MaxCounter(int m) // 사용자가 정의한, int값을 받는 생성자
    {
        max = m;
    }
    
    public void increment()
    {
        if (count >= max) // 현재값이 최댓값과 같거나 크면
        {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
        else
        {
            count++;
        }
    }

    public int getCount()
    {
        return count;
    }
}
