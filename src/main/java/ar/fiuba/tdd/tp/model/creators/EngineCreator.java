package ar.fiuba.tdd.tp.model.creators;

import ar.fiuba.tdd.tp.exceptions.EngineCreatorException;
import ar.fiuba.tdd.tp.model.Engine;
import ar.fiuba.tdd.tp.model.FactoryGame;
import ar.fiuba.tdd.tp.model.Game;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by Martín on 26/04/2016.
 */
public class EngineCreator {

    private Game game;
    private String gameName;
    private ServerSocket serverSocket;

    public EngineCreator(){

    }

    public void addGame(String gameName) {
        GameCreator creator = FactoryGame.getFactory(gameName);
        this.game = creator.createGame();
        this.gameName = gameName;
    }

    public void addListener(int port) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            throw new EngineCreatorException(e);
        }
    }

    public Engine createEngine() {
        if (game != null && serverSocket != null) {
            return new Engine(game, gameName, serverSocket);
        } else {
            throw new EngineCreatorException("No se ha construido el motor correctamente.");
        }
    }

}
