package chap10.sec01;

import chap10.sec01.Class.MyThread;

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread workerThread = new MyThread();
        workerThread.start();

        Thread.sleep(2000);  // 2초 대기
        System.out.println("메인 스레드에서 인터럽트 호출!");
        workerThread.interrupt();  // 인터럽트 호출
    }
}