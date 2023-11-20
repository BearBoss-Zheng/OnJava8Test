package com.zjx.test.streamIO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author zjx
 * @Date 2023-11-15 00:53:15
 * @Desc
 */
public class UsingRandomAccessFile {
    static String file = BufferedInputFile.ABSOLUTE_PATH + "rtest.dat";

    public static void display(){
        try(RandomAccessFile rf = new RandomAccessFile(file, "r")) {
            for (int i = 0; i < 7; i++) {
                System.out.println("Value " + i + ": " + rf.readDouble());
            }
            System.out.println(rf.readUTF());
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        try (RandomAccessFile rf = new RandomAccessFile(file,"rw")){
            for (int i = 0; i < 7; i++) {
                rf.writeDouble(i *1.414);
            }
            rf.writeUTF("The end of the file");
            rf.close();
            display();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        try(RandomAccessFile rf = new RandomAccessFile(file,"rw")){
            //double 的长度是 8 字节长，所以如果要用 seek() 定位到第5 个（从 0 开始计数）double 值，则要传入的地址值应该为 5*8。
            rf.seek(5 * 8);
            rf.writeDouble(47.00001);
            rf.close();
            display();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
