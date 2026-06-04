package chap09.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyExample {
    public static void main(String[] args) {
        long bytesCopied = 0;

        try (
                FileInputStream in = new FileInputStream("JavaProgramming/Files/donut.png");
                FileOutputStream out = new FileOutputStream("JavaProgramming/Files/donut-copy.png")
        ) {
            byte[] buf = new byte[1024];
            int n;

            while ((n = in.read(buf)) != -1) {
                out.write(buf, 0, n);
                bytesCopied += n;
            }

            System.out.println(bytesCopied + " 바이트 복사 완료");

        } catch (IOException e) {
            System.err.println("복사 중 오류 발생: " + e.getMessage());
        }
    }
}
