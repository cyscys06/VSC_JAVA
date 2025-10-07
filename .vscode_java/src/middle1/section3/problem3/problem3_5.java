package middle1.section3.problem3;

public class problem3_5 
{
    public static void main(String[] args) 
    {
        String str = "hello.txt";
        String ext = ".txt";

        System.out.println(":filename = " + str.substring(0, str.indexOf(ext)));
        System.out.println(":filename = " + str.substring(str.indexOf(ext), str.length()));
    }
}
