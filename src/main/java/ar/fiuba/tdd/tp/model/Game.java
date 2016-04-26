package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.interaction.UserInteracter;

/**
 * Created by mariagustina on 23/04/16.
 */
public abstract class Game {

    private GameRules gameRules;
    private String lastUserEvent;

    public Game() {
        this.gameRules = new GameRules();

    }

    public void setGameRules(GameRules gameRules) {
        this.gameRules = gameRules;
    }

    public GameRules getGameRules() {
        return this.gameRules;
    }

    public Game loadRules(String gameName) {
        this.gameRules.load(gameName);
        return this;
    }

    public void giveFirstMessage() {
        UserInteracter interacter = UserInteracter.getInstance();
        interacter.printControllersGame();
    }

    public void startGame() {
        UserInteracter interacter = UserInteracter.getInstance();
        this.lastUserEvent = interacter.handleUserEvent();
        System.out.println(this.lastUserEvent);
    }

    public abstract void continueGame();

    public abstract void consultGameRules();


}
