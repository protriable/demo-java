package com.protry.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelTestOne {

    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

            serverSocketChannel.socket().bind(new InetSocketAddress("http://www.baidu.com", 80));

            SocketChannel socketChannel = serverSocketChannel.accept();


            serverSocketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
