package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.interaction.UserInteracter;

/**
 * Created by mariagustina on 23/04/16.
 */
public abstract class Game {

    public GameRules gameRules;
    public  String lastUserEvent;

    public Game(String gameName) {

        this.gameRules = new GameRules();
        this.gameRules.load(gameName);

    }

    public void giveFirstMessage() {
        UserInteracter interacter = new UserInteracter();
        interacter.printControllersGame();
    }

    public void startGame() {
        UserInteracter interacter = new UserInteracter();
        this.lastUserEvent = interacter.handleUserEvent();
    }

    public abstract void continueGame();

    public abstract void consultGameRules();


}
