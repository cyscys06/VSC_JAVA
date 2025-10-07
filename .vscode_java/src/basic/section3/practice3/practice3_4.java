package section3.practice3;

import section3.myclass3.Data;

public class practice3_4 
{
    public static void main(String[] args) 
    {
        Data dataA = new Data(); // 자료형이 Data인 메모리의 이름을 dataA라 하고, dataA에는 메모리의 참조값(주소)가 복사됨
        dataA.value = 10; // dataA의 멤버 변수 value에 10이라는 값을 복사
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA); // 함수의 매개변수 dataX에 dataA가 갖고있는, Data 메모리의 참조값이 복사됨. 
                                // 즉 이 상태에서 dataA와 dataX는 모두 동일한 메모리를 가리키게 됨
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 바뀐 값 20이 출력
    }
    
    static void changeReference(Data dataX) 
    {
        dataX.value = 20; // dataX가 가리키는 메모리의 멤버변수인 value에 20이라는 값을 복사
                          // -> 원본 값이 바뀐 것이므로 dataA.value도 같이 바뀌겠죠
    }
}

// 기본형(int, double, char 등등 기본적으로 쓸 수 있는 자료형들): 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 
// 이 경우, 메서드 내부에서 매개변수 의 값을 변경해도, 원본 값에는 영향이 없다.
// 참조형(배열, 사용자 정의 클래스의 객체 등): 메서드로 참조형 데이터를 전달하면, 참조값(주소)이 복사되어 전달된다. 
// 이 경우, 메서드 내부에서 매개변수로 전달된 객체의 멤버 변수를 변경하면, 원본 객체 멤버변수의 객체도 변경된다.