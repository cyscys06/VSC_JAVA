package middle1.section5.myclass5;

public enum AuthGrade 
{
    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int l, String d)
    {
        level = l;
        description = d;
    }

    public int getLevel()
    {
        return level;
    }

    public String getDescription()
    {
        return description;
    }

    public void printInformation()
    {
        System.out.println();
    }
}
