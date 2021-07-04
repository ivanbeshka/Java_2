package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        DataOutputStream out;
        DataInputStream in;


        try {
            server = new ServerSocket(8189);
            System.out.println("Server started");
            socket = server.accept();
            System.out.println("Client connected");

            out = new DataOutputStream(socket.getOutputStream());
             in = new DataInputStream(socket.getInputStream());

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                    while (true) {

                        String str = in.readUTF();
                        System.out.println("Client : " + str);


                        if (str.equals("/end")) {
                            System.out.println("Client disconnected");
                            break;
                        }
                    }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
            });
            thread.setDaemon(true);
            thread.start();


            while (true) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                out.writeUTF("Server : " + str);
                if (str.equals("/end")) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
