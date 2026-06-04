package chap10.sec02.Class;

public class Counter {
    private int count = 0;

    public void increment() {
        count++;  // 이 한 줄의 코드가 사실은 여러 단계로 이루어져 있음
    }

    public int getCount() {
        return count;
    }
}