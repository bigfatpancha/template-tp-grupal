package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.engine.model.GameData;
import ar.fiuba.tdd.tp.interaction.UserInteractor;

/**
 * Created by mariagustina on 23/04/16.
 */
public abstract class Game {

    private GameData gameData;
    private String lastUserEvent;

    public Game() { }

    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    public GameData getGameData() {
        return this.gameData;
    }


    public void giveFirstMessage() {
        UserInteractor interacter = UserInteractor.getInstance();
        interacter.printControllersGame();
    }

    public void startGame() {
        UserInteractor interacter = UserInteractor.getInstance();
        this.lastUserEvent = interacter.handleUserEvent();
        System.out.println(this.lastUserEvent);
    }

    public String processMessage(String message) {
        return "Game process:" + message;
    }

    public abstract void continueGame();

    public abstract void consultGameRules();


}
