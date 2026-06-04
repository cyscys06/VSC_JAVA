package chap10.sec02.Class;

public class SyncCounter {
    private int count = 0;

    public synchronized void increment() {  // synchronized 예약어 추가
        count++;  // 이 한 줄의 코드가 사실은 여러 단계로 이루어져 있음
    }

    public int getCount() {
        return count;
    }
}
