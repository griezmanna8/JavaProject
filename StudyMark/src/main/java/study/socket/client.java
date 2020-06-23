package study.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @Author: chenxiliu
 * @Descripion:
 * @Date: Created in 2020/6/23
 */
public class client {
    private static final String msg = "hello socket!";

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw.println(msg);
            pw.flush();
            String line = is.readLine();
            System.out.println("server send: " + line);
            pw.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("client create socket error!");
        }
    }
}
