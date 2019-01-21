package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketDaniel {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getByName("localhost"));
        System.out.println(InetAddress.getLocalHost());
        SocketThread.initMalario();
    }
}

class SocketThread implements Runnable {
    private Socket incoming;

    private SocketThread(Socket i) {
        this.incoming = i;
    }

    static void initMalario() {
        try {
            int i = 1;
            ServerSocket s = new ServerSocket(8000);
            while (true) {
                Socket incoming = s.accept();
                System.out.println("Spawning " + i);
                Runnable r = new SocketThread(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = incoming.getInputStream();
            outStream = incoming.getOutputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }

        assert inStream != null;
        Scanner in = new Scanner(inStream);

        assert  outStream != null;
        PrintWriter out = new PrintWriter(outStream, true);

        out.println("Hello world! It's a me Mario, general malario!");

        boolean done = false;
        while (!done && in.hasNextLine()) {
            String line = in.nextLine();
            out.println("Małpa: " + line);
            if (line.trim().equals("exit")) {
                done = true;
            }
        }
    }
}