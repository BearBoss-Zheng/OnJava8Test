package com.zjx.test.nio;
import com.zjx.test.Constant;

import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.io.*;


/**
 * @author zjx
 * @Date 2023-11-16 10:23:19
 * @Desc
 */
public class BufferToText {
    static String name = Constant.PATH + "nio\\data2.txt";

    private static final int BSIZE = 1024;
    public static void main(String[] args) {

        try(
                FileChannel fc = new FileOutputStream(
                        name).getChannel()
        ) {
            fc.write(ByteBuffer.wrap("Some text".getBytes()));
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        ByteBuffer buff = ByteBuffer.allocate(BSIZE);

        try(
                FileChannel fc = new FileInputStream(
                        name).getChannel()
        ) {
            fc.read(buff);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        buff.flip();
        // 无法运行
        System.out.println(buff.asCharBuffer());
        // 使用默认系统默认编码解码
        buff.rewind();
        String encoding =
                System.getProperty("file.encoding");
        System.out.println("Decoded using " +
                encoding + ": "
                + Charset.forName(encoding).decode(buff));

        // 编码和打印
        try(
                FileChannel fc = new FileOutputStream(
                        name).getChannel()
        ) {
            fc.write(ByteBuffer.wrap(
                    "Some text".getBytes("UTF-16BE")));
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        // 尝试再次读取：
        buff.clear();
        try(
                FileChannel fc = new FileInputStream(
                        name).getChannel()
        ) {
            fc.read(buff);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        buff.flip();
        System.out.println();
        System.out.println(buff.asCharBuffer());
        System.out.println();
        // 通过 CharBuffer 写入：
        buff = ByteBuffer.allocate(60);
        buff.asCharBuffer().put("Some text use asCharBuffer()");

        try(
                FileChannel fc = new FileOutputStream(
                        name).getChannel()
        ) {
            fc.write(buff);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        // 读取和显示：
        buff.clear();

        try(
                FileChannel fc = new FileInputStream(
                        name).getChannel()
        ) {
            fc.read(buff);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        buff.flip();
        System.out.println(buff.asCharBuffer());
    }
}
