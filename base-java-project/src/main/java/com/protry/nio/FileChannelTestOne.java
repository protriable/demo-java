package com.protry.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTestOne {


    public static void main(String[] args) {
        writeToFileByChannel();

    }

    private static void writeToFileByChannel() {
        String path = "nio-data.txt";
        String filePath = createFile(path);

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            String newData = "New String to write to file..." + System.currentTimeMillis();
            ByteBuffer buf = ByteBuffer.allocate(48);
            buf.clear();
            buf.put(newData.getBytes());
            buf.flip();
            while(buf.hasRemaining()) {
                channel.write(buf);
            }

            long position = channel.position();

            buf.compact();
            buf.put(1, (byte) 'b');
            channel.position(position + 10);
            channel.write(buf);

            channel.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileByChannel() {
        String path = "nio-data.txt";
        String filePath = createFile(path);

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int read = channel.read(buffer);
            System.out.println("读到了第" + read + "个");

            channel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String createFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file.getPath();
    }


}
