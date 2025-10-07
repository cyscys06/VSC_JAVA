package middle1.section3.problem3;

public class problem3_6 
{
    public static void main(String[] args) 
    {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0, index = str.indexOf(key);

        while (index >= 0) // index가 문자열 길이보다 작은동안 계속 반복
        {
            index = str.indexOf(key, index + 1); 
            // 인덱스 + 1을 시작범위로 해서 범위 안에 key 값이 있는지 찾고 
            // 있으면 그 문자열의 첫 인덱스를 다시 index에 지정 
            count++; 
            // 위 코드로 인해, 찾은 문자열 개수만큼 카운트가 증가할 것
        }

        System.out.println(count);
    }    
}
