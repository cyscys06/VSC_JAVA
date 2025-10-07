public class test { // 공용 클래스 이름은 항상 파일 이름과 같아야 함
    public static void main(String[] args) throws Exception // 컴파일러가 main 메서드를 호출해야 하므로 반드시 public으로 선언할것
    // static이 있으면 객체 생성 없이도 메서드(main)를 사용할 수 있음(원래 메서드는 객체를 먼저 만든 후 사용해야 함)
    // main()함수의 매개변수는 항상 String[] args 여야 하며, 다른 타입의 매개변수가 오거나 매개변수가 아예 없는 경우에는 에러가 뜸
    // 컴파일러(JVM)이 main()함수를 가장 먼저 인식하는데, 이때 매개변수에 저 코드가 없으면 main()함수를 실행할 수 없음
    // throws Exception: 사소한 에러가 떴을때 그 정보를 사용자에게 미리 알려주어 더 큰 문제가 생기기 전에 에러를 고칠 수 있게 해주는, 비유하면 경보 같은 존재
    // -> 기초 단계에서는 굳이 쓸필요 없고 나중에 실무에서 씀
    {
        System.out.println("Hello, World!");
        // System: 자바에서 기본으로 제공하는 표준 클래스. 입출력과 에러, 시스템 관련 기능을 제공함
        // out: System 클래스에 포함된 static 멤버 변수.
        // println: 괄호 안 내용을 출력하고 자동으로 줄바꿈도 해줌. 
        // ex)print()는 그냥 출력만 해준다면, println()은 출력하고 줄바꿈도 한번에 같이 해주는 것
    }
}

//1. out은 System 클래스의 멤버 변수임 
//2. 근데 멤버변수 out을 Systeam 안에서 선언할때 자료형을 본인이 속한 System형으로 안하고 Printstream이라는 별도의 미리 선언된 클래스 형으로 선언했음 
// 3. 따라서 out은 Printstream 클래스의 메서드인 println()을 사용할 수 있음