package ar.fiuba.tdd.tp.model;

//import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by Lucía on 24/4/2016.
 */

public class FetchQuestGame extends Game {

    public static final String GAME_NAME = "fetch_quest";

    public FetchQuestGame() {
        super();
    }

    public boolean isGameOver() {
        return this.getGameData().getCharacters().get(0).isObjectInInventory("stick");
    }

}
