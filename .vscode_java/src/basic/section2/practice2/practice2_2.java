package basic.section2.practice2; // 폴더 안에서 하위 폴더를 만들때는 현재 이 파일이 속한 폴더의 경로를 패키지 선언 해줘야함
                   // 현재 이 파일이 practice2라는 폴더 안에 있다는 뜻
public class practice2_2 
{
    public static void main(String[] args)
    {
        String[] Student = {"학생1", "학생2"}; 
        int[] StudentAge = {15, 16}; // int[] 형식으로 배열 선언이 가능함. 단 이렇게 배열을 만들려면 초기 배열 크기를 미리 정해줘야 함(초기 크기 없이 초기화 불가능)
        int[] StudentGrade = {90, 80};

        for (int i = 0; i < Student.length; i++)
        {
            System.out.println("이름: " + Student[i] + " 나이: " + StudentAge[i] + " 성적: " + StudentGrade[i]);
        }
    }
    
}
