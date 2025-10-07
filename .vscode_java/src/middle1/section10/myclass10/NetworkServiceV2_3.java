package middle1.section10.myclass10;

public class NetworkServiceV2_3 
{
    public void sendMessage(String data) 
    {
        String address = "http://example.com";
        
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 에러 문자인지를 탐지
        
        try 
        {
            client.connect();
            client.send(data);
            client.disconnect(); 
            // try문 안에 정상 흐름만 담아놓기 
        } 
        catch (NetworkClientExceptionV2 e) 
        {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " +
            e.getMessage());
        }

        // 중복 줄임
    }
}
