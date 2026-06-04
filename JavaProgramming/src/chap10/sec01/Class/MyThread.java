package chap10.sec01.Class;

import org.w3c.dom.css.Counter;

public class MyThread extends Thread {
    public void run1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);  // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run2() {
        System.out.println("스레드 시작: " + Thread.currentThread().getName());
        try {
            System.out.println("5초 동안 대기합니다.");
            Thread.sleep(5000);  // 5초 대기
            System.out.println("대기 완료!");
        } catch (InterruptedException e) {
            System.out.println("스레드 대기 중 인터럽트 발생!");
            Thread.currentThread().interrupt();  // 플래그를 다시 설정
        } finally {
            System.out.println("스레드 종료: " + Thread.currentThread().getName());
        }
    }
}