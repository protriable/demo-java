package com.protry.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelTestOne {

    public static void main(String[] args) {
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.connect(new InetSocketAddress("http://www.baidu.com", 80));


            ByteBuffer buffer = ByteBuffer.allocate(48);
            int read = socketChannel.read(buffer);
            System.out.println("从百度读取了" + read + "个字节");

            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
