package ar.fiuba.tdd.tp.model;

/**
 * Created by samiloiza on 25/04/16.
 */
public class DamnObjectCreator extends GameCreator {
    @Override

    public Game createGame() {

        return new DamnObject();
    }
}
