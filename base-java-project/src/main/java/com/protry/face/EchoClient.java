package com.protry.face;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) throws IOException {
        final Socket socket = new Socket("localhost", 6789);
        final Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容:");
        String msg = scanner.nextLine();
        scanner.close();
        final PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println(msg);
        printWriter.flush();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(bufferedReader.readLine());
        socket.close();
    }
}
