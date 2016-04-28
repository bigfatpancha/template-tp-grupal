package ar.fiuba.tdd.tp.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Martín on 26/04/2016.
 */
public class MainClient {

    private Socket clientSocket;
    private Scanner scanner;
    private ObjectOutputStream outStream;
    private ObjectInputStream inStream;

    private MainClient(int portNumber, String host) throws IOException {
        init(portNumber, host);
    }

    private void init(int portNumber, String host) throws IOException {
        clientSocket = new Socket(host, portNumber);
        scanner = new Scanner(System.in, "UTF-8");
        outStream = new ObjectOutputStream(clientSocket.getOutputStream());
        inStream = new ObjectInputStream(clientSocket.getInputStream());
        System.out.println(inStream.readUTF());
    }

    public static void main(String[] args) {

        String address = askForConnect();
        String[] parsedAdd = address.split(":");
        String host = parsedAdd[0];
        int port;
        try {
            port = Integer.parseInt(parsedAdd[1]);
        } catch (NumberFormatException e) {
            port = 5050; // Default Port
        }
        MainClient client = null;
        try {
            client = new MainClient(port, host);
            client.loop();
        } catch (UnknownHostException e) {
            System.out.println("No se pudo establecer la conexion con el host: " + host);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (client != null) {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static String askForConnect() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Bienvenido! Para conectarse a un servidor, ingrese <connect [ip:port]>.");
        String input = scanner.nextLine();
        String[] parsedInput = input.split(" ");
        while (parsedInput.length < 2 || !"connect".equalsIgnoreCase(parsedInput[0]) || !parsedInput[1].contains(":")) {
            System.out.println("Comando incorrecto. Ingrese <connect [ip:port]> "
                    + " para conectarse a un servidor.");
            input = scanner.nextLine();
            parsedInput = input.split(" ");
        }
        return parsedInput[1];
    }

    private void close() throws IOException {
        outStream.close();
        inStream.close();
        clientSocket.close();
        scanner.close();
    }

    private void loop() throws IOException {
        while (true) {
            String responseMessage = sendAndReceive();
            System.out.println(responseMessage);
            if (responseMessage.contains("You win!!")) {
                break;
            }
        }
    }

    private String sendAndReceive() throws IOException {
        String requestMessage = scanner.nextLine();
        outStream.writeUTF(requestMessage);
        outStream.flush();
        return inStream.readUTF();
    }

}
