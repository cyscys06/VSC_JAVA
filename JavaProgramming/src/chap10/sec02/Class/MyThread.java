package chap10.sec02.Class;

class MyThread extends Thread {  // Thread 클래스를 상속하여 스레드 생성
    private Counter counter1;
    private SyncCounter counter2;

    public MyThread(Counter counter) {
        this.counter1 = counter;
    }

    public MyThread(SyncCounter counter) {
        this.counter2 = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter1.increment();
        }
    }
}