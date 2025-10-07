package basic.section12.problem12;

import basic.section12.myclass12.EmailSender;
import basic.section12.myclass12.SmsSender;
import basic.section12.myclass12.FaceBookSender;
import basic.section12.myclass12.Sender;

public class problem12_1 
{
    public static void main(String[] args) 
    {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        
        for (Sender sender : senders) 
        {
            sender.sendMessage("환영합니다!");
        }
    }
}