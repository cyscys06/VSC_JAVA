package section8.myclass8;

public class MathArrayUtils 
{
    public static int sum(int[] arr)
    {
        int res = 0; // 지역변수는 선언만 하지말고 반드시 임의의 값으로 초기화 해놓을 것
        
        for (int i = 0; i < arr.length; i++)
        {
            res += arr[i];
        }

        return res;
    }

    public static int average(int[] arr)
    {
        int res = 0;
        for (int i = 0; i < arr.length; i++)
        {
            res += arr[i];
        }

        res /= arr.length;

        return res;
    }
    
    public static int min(int[] arr)
    {
        int res = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (res > arr[i])
            {
                res = arr[i];
            }
        }

        return res;
    }

    public static int max(int[] arr)
    {
        int res = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (res < arr[i])
            {
                res = arr[i];
            }
        }

        return res;
    }
}
