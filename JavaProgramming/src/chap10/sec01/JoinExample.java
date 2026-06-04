package chap10.sec01;

import chap10.sec01.Class.MyTask;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyTask(), "1번 스레드");
        Thread thread2 = new Thread(new MyTask(), "2번 스레드");

        thread1.start();
        thread1.join();  // thread1이 끝날 때까지 main 스레드 대기

        thread2.start();         // thread1이 끝난 후 thread2 시작
        thread2.join();  // thread2가 끝날 때까지 main 스레드 대기

        System.out.println("메인 스레드: 모든 작업이 완료되었습니다.");
    }
}