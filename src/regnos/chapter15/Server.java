package regnos.chapter15;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("i am listening");
            serverSocket.accept();
            System.out.println("CONNECTED");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
