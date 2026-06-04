package chap10.sec01;

import chap10.sec01.Class.MyThread;

public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();  // Thread 타입 객체 thread1 생성
        MyThread thread2 = new MyThread();  // Thread 타입 객체 thread2 생성

        thread1.start();  // thread1 시작
        thread2.start();  // thread2 시작
    }
}
