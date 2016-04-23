package ar.fiuba.tdd.tp.server;


import ar.fiuba.tdd.tp.interaction.UserInteracter;
import ar.fiuba.tdd.tp.model.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/*
 * Created by Lucía on 16/4/2016.
 */
public class Server extends Thread {

    private ServerSocket serverSocket;

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public final void run() {
        while (true) {
            try {
                System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();

                System.out.println("Just connected to "
                        + server.getRemoteSocketAddress());

                DataInputStream in =
                        new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());

                DataOutputStream out =
                        new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");

                server.close();
            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                break;
            } catch (IOException e) {
                System.out.println("Socket exception!");
                e.printStackTrace();
                break;
            }
        }
    }


    public static void main(String[] args) {

        //TODO: PASARESLO POR PARAMETRO
        UserInteracter userInteracter = new UserInteracter();
        String inputGame = userInteracter.inputGame();
        Engine motor = new Engine(inputGame);
        motor.run();

        //TODO: poner los distintos juegos para que los cargue y que lo valide en el string
        if (!inputGame.equals("load game")) {
            System.out.println("Lo sentimos, usted ha ingresado un juego invalido");
            return;
        }

        int port = 4444; //Integer.parseInt(args[0]);
        try {
            Thread th = new Server(port);
            th.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
