package br.com.caelum.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
    public static void main (String[] args) throws IOException, UnknownHostException {
        Socket client = new Socket("127.0.0.1", 12345);
        System.out.println("O cliente se conectou ao servidor!");

        Scanner keyboard = new Scanner(System.in);
        PrintStream output = new PrintStream(client.getOutputStream());

        while (keyboard.hasNextLine()) {
            output.println(keyboard.nextLine());
        }

        output.close();
        keyboard.close();
    }
}
