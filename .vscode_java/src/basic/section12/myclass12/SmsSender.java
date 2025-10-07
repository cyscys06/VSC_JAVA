package basic.section12.myclass12;

public class SmsSender implements Sender
{
    @Override
    public void sendMessage(String s)
    {
        System.out.println("SMS를 발송합니다: " + s);
    }    
}
