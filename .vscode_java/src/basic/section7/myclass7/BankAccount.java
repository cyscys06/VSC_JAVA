package basic.section7.myclass7;

public class BankAccount 
{
    private int balance; // 잔액

    public BankAccount() // 사용자 정의 기본 생성자 
    // 다른 클래스에서 새로운 객체를 만들 때 사용돼야 하므로 public으로 선언
    {
        balance = 0;
    }

    // public 메서드: deposit
    public void deposit(int amount) 
    // 다른 클래스에서 외부 값을 입력받아 객체 멤버변수 안에 복사해야 하므로 public 선언
    // 즉, 외부 클래스가 사용해야 하므로 public 선언함
    {
        if (isAmountValid(amount)) 
        {
            balance += amount;
        } 
        else 
        {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    
    // public 메서드: withdraw
    public void withdraw(int amount) // deposit과 같음
    {
        if (isAmountValid(amount) && balance - amount >= 0) 
        {
            balance -= amount;
        } 
        else // 값 유효하지 않거나 잔액 모자라면
        {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }
    
    // public 메서드: getBalance 
    // 현재 잔액을 반환
    public int getBalance() 
    {
        return balance;
    }
    
    // private 메서드: isAmountValid
    // 받은 금액이 유효한지 아닌지를 외부 클래스에서 할 필요 없음. 
    // 내부에서 알아서 검사만하고 유효 여부를 사용자에게 알려주는건 public 메서드 부분에서 하는 것임.
    private boolean isAmountValid(int amount) 
    {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}