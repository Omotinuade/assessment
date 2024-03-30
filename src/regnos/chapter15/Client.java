package regnos.chapter15;

import java.io.IOException;
import java.net.Socket;

public class Client {


    public static void main(String[] args) {


    Socket socket;


        try {
            socket = new Socket("192.168.0.180",5000);
            System.out.println("CONNECTED");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
