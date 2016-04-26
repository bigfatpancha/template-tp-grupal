package ar.fiuba.tdd.tp.model;

/**
 * Created by mariagustina on 23/04/16.
 */
public class Engine {

    private Game game;
    //TODO la variable gameCreator no deberia ser de esta clase, deberia ser un singleton o algo gobal
    private GameCreator gameCreator = new FetchQuestCreator();

    public Engine(String gameName) {
        this.game = gameCreator.crateGame(gameName);
    }

    public Game loadGame() {
        return this.game;
    }

    public void run() {
        System.out.println("Running");

        /*aca deberiamos hacer tod o lo que
        tienen en comun todos los juegos
         */

        this.game.giveFirstMessage();
        this.game.startGame();
        this.game.continueGame();
    }

}

