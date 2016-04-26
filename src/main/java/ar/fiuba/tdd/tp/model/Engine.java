package ar.fiuba.tdd.tp.model;

/**
 * Created by mariagustina on 23/04/16.
 */
public class Engine {

    private Game game;
    private String gameName;
    //TODO la variable gameCreator no deberia ser de esta clase, deberia ser un singleton o algo gobal

    public Engine(String gameName) {
        this.gameName = gameName;
        GameCreator creator = FactoryGame.getFactory(gameName);
        this.game = creator.createGame();

    }

    public void loadGame() {
        this.game.loadRules(this.gameName);
    }

    public void run() {
        this.loadGame();
        System.out.println("Running");
    }

}

