package basic.section4.problem4;

import basic.section4.myclass4.Account;

public class problem4_2 
{
    public static void main(String[] args)
    {
        Account account = new Account(); // 객체 생성(잔액은 0으로 시작)

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance); // 현재 잔고 출력
    }    
}
