package study.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: chenxiliu
 * @Descripion:
 * @Date: Created in 2020/6/23
 */
public class Server {
    public static void main(String[] args) {
        try {
            /**
             * create ServerSocket and bind port is 8080
             */
            ServerSocket server = new ServerSocket(8080);
            Socket socket = server.accept();
            /**
             * create BufferedReader to read data
             */
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = is.readLine();
            System.out.println("client say: " + line);
            /**
             * create PrintWriter to send data
             */
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println(line);
            pw.flush();
            pw.close();
            is.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("create server socket error!");
        }
    }
}
