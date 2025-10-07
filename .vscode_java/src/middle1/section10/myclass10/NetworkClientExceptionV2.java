package middle1.section10.myclass10;

public class NetworkClientExceptionV2 extends Exception
// 자바 기본 예외 클래스인 Exception 클래스를 상속받았으므로,
// 이 클래스 또한 예외 클래스이고 체크 예외에 해당됨
// 체크 예외: 사용자가 명시적으로 예외를 처리하거나 main밖으로 던져서 오류 메세지를 출력해야 하는 예외 종류
{
    private String errorCode;
    
    public NetworkClientExceptionV2(String e, String m)
    {
        super(m); // 부모 클래스인 Exception의 생성자 불러옴
                  // 예외도 객체이므로 필요한 필드, 메서드를 가질 수 있음
        errorCode = e;
    }

    public String getErrorCode()
    {
        return errorCode;
    }
}
