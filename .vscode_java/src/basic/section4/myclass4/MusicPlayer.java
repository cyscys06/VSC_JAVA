package basic.section4.myclass4;

public class MusicPlayer 
{
    public int volume = 0;
    public boolean isOn = false;
    
    public void on() 
    {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    
    public void off() 
    {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    
    public void volumeUp() 
    {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    
    public void volumeDown() 
    {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    
    public void showStatus() 
    {
        System.out.println("음악 플레이어 상태 확인");
        
        if (isOn) 
        {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } 
        else 
        {
            System.out.println("음악 플레이어 OFF");
        }
    }
}

// 클래스 안에서 static 사용 안하는 이유:
// static은 클래스 자체에 귀속되는 키워드로써, 아무리 많은 객체가 만들어져도 클래스에서 단 하나만 존재하게 된다.
// 또한 static 키워드를 가진 속성은 모든 객체에서 동일한 값을 가지므로(즉 모든 객체에서 static 변수의 값을 공유하므로)
// 객체마다 서로 다른 값을 가질 수 없게 된다. 따라서 static 변수에는 보통 객체들이 공통으로 가지고 있는 값이 들어가게 된다.
// 또한 static 키워드를 가진 기능은 클래스 자체에 귀속됨으로 인해 객체가 생성되지 않았더라도 클래스의 이름을 빌려 사용 가능하다.
// 이는 단점도 있는데, static 메서드는 클래스에 귀속된 상태이므로 객체에 속한 상태인 멤버 변수나 메서드에는 접근이 불가능하다.
  