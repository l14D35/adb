package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest implements Runnable {
    public static void main(String[] args) {
        Runnable r = new ServerTest();
        Thread t = new Thread(r);
        t.start();
    }

    private static void initServer() {
        {
            try {
                ServerSocket server = new ServerSocket(6000);

                while (true) {
                    Socket client = server.accept();
                    System.out.println(client.getInetAddress().getHostAddress());


                    InputStream inStream = client.getInputStream(); // wejscie in - to co robi klient - wyslanie informacji na server
                    OutputStream outStream = client.getOutputStream(); //wyjscie - to co widzi klient

                    PrintWriter pw = new PrintWriter(outStream, true);

                    pw.println("Wysłano komunikat do klienta");

                    Scanner in = new Scanner(inStream);

                    boolean done = false;
                    while (!done && in.hasNextLine()) {
                        String line = in.nextLine(); // wyslanie informacji na serwer
                        pw.println("Napisałeś: " + line);
                        if (line.trim().equals("komunikacja")) {
                            done = true;
                            try {
                                Thread.sleep(5000);
                                pw.println("Połączenie zatwierdzone");
                                Thread.sleep(12000);
                                pw.println("Kończę pracę");
                                client.close();
                               // pw.server.close();
                                Thread.currentThread().interrupt();

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            pw.println("Złe hasło!");
                            client.close();
                            server.close();
                            Thread.currentThread().interrupt();
                        }
                    }

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        initServer();
    }
}
