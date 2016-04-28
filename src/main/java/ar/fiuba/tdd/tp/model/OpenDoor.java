package ar.fiuba.tdd.tp.model;

/**
 * Created by samiloiza on 25/04/16.
 */
public class OpenDoor extends Game {

    public OpenDoor() {
        super();
    }


/*    @Override
    public String processMessage(String message) {
        return "OpenDoor:" + message;
    }
*/
    public void continueGame() {
        //TODO
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
