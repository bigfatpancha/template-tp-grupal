package ar.fiuba.tdd.tp.model;

/**
 * Created by mariagustina on 23/04/16.
 */
public class Engine {

    private Game game;

    public Engine(String gameName) {
        this.game = new Game(gameName);
        this.loadGame();

    }

    private void loadGame() {
        game.load();
    }

    public void run() {
        System.out.println("Running");
    }

}

