package middle1.section3.problem3;

public class problem3_2 
{
    public static void main(String[] args) 
    {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0, l;
        for (int i = 0; i < arr.length; i++) 
        // 배열이면 이터레이터(String s : arr) 쓰는것 괜찮음
        {
            l = arr[i].length();
            sum += l;
            System.out.println(arr[i] + ":" + l);
        }
        
        System.out.println("sum = " + sum);
    }
}
