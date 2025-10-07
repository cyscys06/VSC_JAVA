package middle1.section10.myclass10;

public class NetworkServiceV2_2 
{
    public void sendMessage(String data)
    {
        String address = "https://example.com";

        NetworkClientV2 client = new NetworkClientV2(address); 
        // address 변수의 문자열을 받아서 NetworkClientV2의 불변 변수 address에 저장
        client.initError(data);

        try
        {
            client.connect();
        }
        catch (NetworkClientExceptionV2 e)
        {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }
        // 서버 연결할때의 예외를 잡는 try-catch문

        try
        {
            client.send(data);
        }
        catch (NetworkClientExceptionV2 e)
        {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
            return;
        }
        // 데이터를 전송할때의 예외를 잡는 try-catch문

        client.disconnect();
    }    
}
