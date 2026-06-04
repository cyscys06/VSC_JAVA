package chap11.sec01;

import javax.swing.*;
import java.awt.*;

public class GUIExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GUI Example");
        jf.setSize(300, 200);
        jf.setLayout(new BorderLayout());

        JPanel jp = new JPanel(new GridLayout(2, 2));
        jp.setBackground(new Color(255, 255, 0, 128));
        jp.add(new JButton("버튼1"));
        jp.add(new JButton("버튼2"));
        jp.add(new JButton("버튼3"));

        jf.add(jp, BorderLayout.CENTER);

        Font font = new Font("굴림체", Font.BOLD + Font.ITALIC, 20);


        JButton jb = new JButton("확인");
        jb.setBackground(Color.GREEN);
        jb.setBackground(Color.YELLOW);
        jf.add(jb, BorderLayout.SOUTH);
        jb.setFont(font);


//        JButton jb1 = new JButton("버튼1");
//        jb1.setBounds(0, 0, 100, 30);
//        jf.add(jb1);
//
//        JButton jb2 = new JButton("버튼2");
//        jb1.setBounds(180, 0, 100, 30);
//        jf.add(jb1);
//
//        JButton jb3 = new JButton("버튼3");
//        jb1.setBounds(100, 120, 100, 30);
//        jf.add(jb1);


        jf.setLocationRelativeTo(null);
        // jf.pack();
        jf.setVisible(true);
    }
}
