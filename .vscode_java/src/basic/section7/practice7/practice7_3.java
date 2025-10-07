package basic.section7.practice7;

import basic.section7.myclass7.BankAccount;

public class practice7_3 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(); // 기본생성자는 public이라 가능

        account.deposit(10000); 
        account.withdraw(3000);
        // 둘다 public이라 가능
        // 메서드의 내부에서 private 메서드인 isAmountValid가 돌아감

        System.out.println("balance = " + account.getBalance());
    }
}