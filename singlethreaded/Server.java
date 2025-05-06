package singlethreaded;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

    static int PORT = 8010;

    public void run() throws SocketException {
        ServerSocket socket = new ServerSocket(PORT);
        socket.setSoTimeout(10000);
        while(true){
            try {
                System.out.println("Server is running");
                Socket accepted = socket.accept();
                System.out.println("Accepted request "+accepted.getRemoteSocketAddress());
                PrintWriter toClient = new PrintWriter(accepted.getOutputStream());
                BufferedReader fromClient = new BufferedReader(accepted.getInputStream());
            }catch (IOException e){

            }

        }
    }

    public static void main(String[] args) {

    }
}
