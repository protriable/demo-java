package com.protry.face;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoService {

    private static final int ECHO_SERVER_PORT = 6789;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(ECHO_SERVER_PORT)){
            System.out.println("服务器已经启动...");
            while (true) {
                final Socket client = serverSocket.accept();
                new Thread(new ClientHandler(client)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {

        private Socket client;

        public ClientHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try (final BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
                 final PrintWriter printWriter = new PrintWriter(client.getOutputStream())){
                final String msg = bufferedReader.readLine();
                System.out.println("收到" + client.getInetAddress() +
                        "发送的:" + msg);
                printWriter.println(msg);
                printWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
