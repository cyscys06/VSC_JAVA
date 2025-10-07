package middle1.section10.myclass10;

public class NetworkServiceV2_1 
{
    public void sendMessage(String data) throws NetworkClientExceptionV2
    {
        String address = "http://example.com";
        
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        
        client.connect();
        client.send(data);
        client.disconnect();

        // 예외가 발생했을때, 예외 객체를 만들어서 throw로 던지는 과정은 없음
        // connect 메서드 자체에 예외를 전달하는 코드가 있음
        // sendMessage에서 connect를 호출했는데 예외 발생했으므로 connect는 예외를 sendMessage로 전달
        // sendMessage는 예외를 처리하는 기능이 없으므로 자연스럽게 예외를 자신을 호출한 메서드에게 다시 전달함
    }    
}
