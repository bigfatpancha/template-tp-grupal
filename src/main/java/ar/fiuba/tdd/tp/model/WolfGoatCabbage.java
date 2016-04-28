package ar.fiuba.tdd.tp.model;

/**
 * Created by Lucía on 27/4/2016.
 */
public class WolfGoatCabbage extends Game {
    public WolfGoatCabbage() {
        super();
    }


    public void consultGameRules() {
        //TODO
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    public String processMessage(String message) {
        return "Game process:" + message;
    }

}
