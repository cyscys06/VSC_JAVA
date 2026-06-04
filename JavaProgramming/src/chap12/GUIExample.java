package chap12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ActionListenerExample extends JFrame {
    public ActionListenerExample() {
        this.setTitle("GUI Example");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JLabel jl = new JLabel("버튼을 클릭하세요.");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                jl.setText("드래그 X : " + e.getX() + ", Y : " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                jl.setText("이동 X : " + e.getX() + ", Y : " + e.getY());
            }
        });
//        jl.addMouseListener(new MouseAdapter() {
//            // MouseListener는 5개 메서드 다 오버라이드 해줘야함(필수)
//            // MouseAddapter는 5개 메서드 중에서 내가 필요한 메서드만 선택하여 오버라이드 해줄 수 있음
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                jl.setText("마우스를 틀릭함, 좌표 " + e.getX() + ", " + e.getY());
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                jl.setText("마우스 들어옴");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                jl.setText("마우스 나감");
//            }
//        });

        this.add(jl, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setVisible(true);

//        JPanel jp = new JPanel(new GridLayout(1, 2));
//        JButton saveButton = new JButton("저장");
//        JButton cancelButton = new JButton("취소");

//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jl.setText("저장버튼 클릭");
//            }
//        };
//
//        cancelButton.addActionListener(new ActionListener() {
//            // 버튼별로 전부 이벤트 핸들러를 만들 수 없으므로
//            // 이벤트 객체 e의 타입별로 구분하여 핸들러 코드 작성
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String command = e.getActionCommand();
//                if (command.equals("저장")) {
//                    jl.setText("저장버튼 클릭");
//                } else if (command.equals("취소")) {
//                    jl.setText("취소버튼 클릭");
//                }
//            }
//        });
//
//        saveButton.addActionListener(listener);
//        cancelButton.addActionListener(listener);
//
//        jp.add(saveButton);
//        jp.add(cancelButton);
//        this.add(jp, BorderLayout.CENTER);
//        this.add(jl, BorderLayout.SOUTH);
//
//    }
    }
}

public class GUIExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ActionListenerExample());
    }
}