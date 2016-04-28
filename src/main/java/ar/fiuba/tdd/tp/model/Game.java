package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.engine.conf.GameConfigurationReader;
import ar.fiuba.tdd.tp.engine.conf.GameNotFoundException;
import ar.fiuba.tdd.tp.engine.model.GameData;
import ar.fiuba.tdd.tp.interaction.UserInteractor;

/**
 * Created by mariagustina on 23/04/16.
 */
public abstract class Game {

    private GameData gameData;
    private String lastUserEvent;


    public void loadGame(String gameName){
        try {
            this.gameData = GameConfigurationReader.getInstance().readGameConfiguration(gameName);
        } catch (GameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public GameData getGameData() {
        return this.gameData;
    }

    public void setGameData(GameData gameData) {
        this.gameData = gameData;
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

    public abstract String processMessage(String message);

    public abstract boolean isGameOver();


}
