package chap10.sec01;

import chap10.sec01.Class.MyTask;

public class RunnableExample {
    public static void main(String[] args) {
        MyTask task = new MyTask();               // Runnable 구현 객체 생성
        Thread thread1 = new Thread(task, "1번 스레드");
        Thread thread2 = new Thread(task, "2번 스레드");

        thread1.start();  // 스레드 시작
        thread2.start();
    }
}