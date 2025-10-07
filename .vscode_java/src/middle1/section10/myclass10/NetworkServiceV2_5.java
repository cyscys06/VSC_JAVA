package middle1.section10.myclass10;
public class NetworkServiceV2_5 
{
    public void sendMessage(String data) 
    {
        String address = "https://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        
        try 
        {
            client.connect();
            client.send(data);
        } 
        catch (NetworkClientExceptionV2 e) 
        {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " +
            e.getMessage());
        } 
        finally 
        {
            client.disconnect();
            // 정상흐름이건, catch로 예외를 잡았건, catch가 잡지 못한 예외건 간에 상관없이
            // 블록 속 코드를 반드시 실행하는 finally 구문
            // 예외를 밖으로 던지는 경우(즉 해당 예외를 처리하는 기능이 아무것도 없을떄)에도 
            // finally 구문을 먼저 출력하고 이후 예외 메세지를 출력
        }
    }
}