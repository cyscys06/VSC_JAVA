package basic.section4.practice4;

import basic.section4.myclass4.MusicPlayer;

public class practice4_1 
{
    public static void main(String[] args) 
    {
        MusicPlayer player = new MusicPlayer();
    
        //음악 플레이어 켜기
        player.on();
    
        //볼륨 증가
        player.volumeUp();
    
        //볼륨 증가
        player.volumeUp();
    
        //볼륨 감소
        player.volumeDown();
    
        //음악 플레이어 상태
        player.showStatus();
    
        //음악 플레이어 끄기
        player.off();
    }
}