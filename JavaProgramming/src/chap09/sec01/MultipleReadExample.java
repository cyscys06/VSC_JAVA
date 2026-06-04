package chap09.sec01;

import java.io.FileReader;
import java.io.IOException;

public class MultipleReadExample {
    public static void main(String[] args) {
        try (FileReader fin = new FileReader("JavaProgramming/Files/menu.txt")) {
            char[] cbuf = new char[10];
            int count;

            while ((count = fin.read(cbuf)) != -1) {
                for (int i = 0; i < count; i++) {
                    System.out.print(cbuf[i]);
                }
            }

        } catch (IOException e) {
            System.err.println("오류 발생: " + e.getMessage());
        }
    }
}