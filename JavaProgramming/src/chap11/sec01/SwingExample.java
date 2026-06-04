package chap11.sec01;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // JFrame 함수로 JFrame 객체 생성
        JFrame jf = new JFrame("Swing Example");
        // 창크기 가로 300, 세로 200으로 설정
        jf.setSize(300, 200);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 방법 설정

        JButton button = new JButton("Click Me"); // CLick Me라는 버튼 생성
        jf.add(button); // jf 프레임에 button 버튼 추가

        jf.setLocationRelativeTo(null); // 화면 중앙 배치
        jf.setVisible(true); // 프레임 보이기
    }
}
