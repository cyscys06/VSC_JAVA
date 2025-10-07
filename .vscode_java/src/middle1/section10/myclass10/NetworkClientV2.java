package middle1.section10.myclass10;

public class NetworkClientV2
{
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String a)
    {
        address = a;
    }

    public void connect() throws NetworkClientExceptionV2
    // 해당 메서드에서 NetworkClientExceptionV2라는 예외가 발생할 수 있다는 선언
    // 예외 이름: NetworkClientExceptionV2
    // 예외 이름은 문제가 발생할 수 있는 특정 상황을 바탕으로 이름 지어야 함
    {
        if (connectError)
        {
            throw new NetworkClientExceptionV2("connectError", address + "서버 연결 실패"); 
            // 오류 발생하면 예외 객체를 만들어서 오류코드, 오류메세지를 담고 throw로 만든 객체를 던짐
        }

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientExceptionV2
    {
        if (sendError)
        {
            throw new NetworkClientExceptionV2("sendError", address + "서버에 데이터 전송 실패");
        }

        System.out.println(address + " 서버에 데이터 전송" + data);
    }

    public void disconnect()
    {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data)
    {
        if (data.contains("error1")) // 매개변수가 error1이라는 메세지 포함하면
        {
            connectError = true; // 오류 발생
        }

        if (data.contains("error2"))
        {
            sendError = true;
        }
    }
}
