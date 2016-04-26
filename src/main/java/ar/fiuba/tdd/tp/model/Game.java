package ar.fiuba.tdd.tp.model;

/**
 * Created by mariagustina on 23/04/16.
 */
public abstract class Game {
    private GameRules gameRules;

    public Game() {
        this.gameRules = new GameRules();

    }

    public Game loadRules(String gameName) {
        this.gameRules.load(gameName);
        return this;
    }

}
