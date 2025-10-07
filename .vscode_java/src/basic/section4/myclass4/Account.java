package basic.section4.myclass4;

public class Account 
{
    public int balance; // 잔액
    
    // 메서드(이번엔 외부 데이터 필요함)
    public int deposit(int amount)
    {
        return balance += amount; // 입금액을 더한 잔액을 반환 
    }

    public int withdraw(int amount) 
    {
        if (balance >= amount) // 잔액이 출금액보다 크거나 같으면
        {
            return balance -= amount; // 출금액을 뺀 잔액을 반환
        }
        else // 잔액이 출금액보다 작으면 출금 못함
        {
            System.out.println("잔액 부족");
            return balance; // 출금액을 빼지 않은 상태의 잔액을 반환
        }
    }
}
