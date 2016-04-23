package ar.fiuba.tdd.tp.client;


import java.io.*;
import java.net.Socket;

/**
 * Created by Lucía on 16/4/2016.
 *
 * 
 */
public class Client {

    public static void main(String args[]) {

        //TODO: pasarlo por argumento
        String serverName = "0.0.0.0";//args[0];
        int port = 4444; //Integer.parseInt(args[1]);

        try {
            System.out.println("Connecting to " + serverName +
                    " on port " + port);

            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to "
                    + client.getRemoteSocketAddress());

            OutputStream outToServer = client.getOutputStream();

            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from "
                    + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();

            DataInputStream in =
                    new DataInputStream(inFromServer);

            System.out.println("Server says " + in.readUTF());
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
