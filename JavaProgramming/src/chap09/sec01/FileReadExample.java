package chap09.sec01;

import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try (FileReader fin = new FileReader("JavaProgramming/Files/menu.txt")) {
            int ch;

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.err.println("오류 발생: " + e.getMessage());
        }
    }
}