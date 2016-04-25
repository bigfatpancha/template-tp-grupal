package ar.fiuba.tdd.tp.model;

/**
 * Created by mariagustina on 23/04/16.
 */
public abstract class Game {
    private GameRules gameRules;

    public Game(String gameName) {
        this.gameRules = new GameRules();
        this.gameRules.load(gameName);
    }

}