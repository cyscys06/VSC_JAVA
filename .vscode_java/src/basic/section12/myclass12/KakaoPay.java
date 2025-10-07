package basic.section12.myclass12;

public class KakaoPay implements PayService
{
    @Override
    public void processPay(String option, int amount) 
    {
        boolean result;

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        
        if (option.equals("kakao")) 
        {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } 
        else 
        {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if (result) 
        {
            System.out.println("결제가 성공했습니다.");
        } 
        else 
        {
            System.out.println("결제가 실패했습니다.");
        }
    }  
    
    public boolean pay(int amount) 
    {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        
        return true;
    }
}