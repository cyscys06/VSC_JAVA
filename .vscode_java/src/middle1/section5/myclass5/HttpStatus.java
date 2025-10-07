package middle1.section5.myclass5;

public enum HttpStatus 
{
    OK(200, "OK"), 
    BAD_REQUEST(400, "Bad Request"), 
    NOT_FOUND(404, "Not Found"), 
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int c, String m)
    {
        code = c;
        message = m;
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

    public static HttpStatus findByCode(int h)
    {
        for (HttpStatus http : values()) 
        // values(): 모든 enum 상수를 포함하는 배열 반환
        {
            if (http.getCode() == h)
            {
                return http;
            }
        }
        
        return null;
    }

    public boolean isSuccess()
    {
        if (message == "OK")
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
