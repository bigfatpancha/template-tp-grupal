package ar.fiuba.tdd.tp.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mariagustina on 23/04/16.
 */
public class Engine extends Thread {

    private Game game;
    private String gameName;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private ObjectInputStream inStream;
    private ObjectOutputStream outStream;

    //TODO la variable gameCreator no deberia ser de esta clase, deberia ser un singleton o algo gobal

    public Engine(Game game, String gameName, ServerSocket serverSocket) {
        this.game = game;
        this.serverSocket = serverSocket;
        this.gameName = gameName;
    }

    private void loadGame() {
        this.game.loadRules(this.gameName);
    }

    public void run() {
        this.loadGame();
        System.out.println("Running");

        init();

        // this.game.startGame(); FIXME by nahuesosa
        loop();
        close();
        //FIXME by nahuesosa
    }

    private void init() {
        try {
            clientSocket = serverSocket.accept();
            inStream = new ObjectInputStream(clientSocket.getInputStream());
            outStream = new ObjectOutputStream(clientSocket.getOutputStream());
            outStream.writeUTF("Welcome to " + gameName);
            outStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void close() {
        try {
            outStream.close();
            inStream.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loop() {
        while (true) {
            try {
                String requestMessage = readRequest();
                System.out.println("Request Message: " + requestMessage + ".");
                String responseMessage = this.game.processMessage(requestMessage);
                sendResponse(responseMessage);
            } catch (IOException e) {
                e.printStackTrace();
                break;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    private String readRequest() throws IOException, ClassNotFoundException {return inStream.readUTF();
    }

    private void sendResponse(String message) throws IOException {
        outStream.writeUTF("From server: " + message);
        outStream.flush();
    }

}

