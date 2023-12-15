package outputstram_;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferCopy02 {
    public static void main(String[] args) {
        //ソースファイルとデスティネーションファイルのパス
        String srcFilePath = "d:\\aa.png";
        String destFilePath = "d:\\cay.png";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // FileInputStream と FileOutputStream を使用して BufferedInputStream と BufferedOutputStream を作成
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            // ファイルをループして読み取り、destFilePath に書き込む
            byte[] buff = new byte[1024];
            int readLen;

            // 戻り値が -1 の場合、ファイルの読み込みが完了しました
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

