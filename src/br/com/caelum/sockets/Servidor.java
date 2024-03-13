package br.com.caelum.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main (String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");

        Socket client = server.accept();
        System.out.println("Nova conexão com o cliente " + client.getInetAddress().getHostAddress());

        Scanner input = new Scanner(client.getInputStream());
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

        input.close();
        server.close();
    }
}
