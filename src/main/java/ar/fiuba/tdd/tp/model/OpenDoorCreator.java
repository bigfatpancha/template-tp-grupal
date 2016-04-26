package ar.fiuba.tdd.tp.model;

/**
 * Created by samiloiza on 25/04/16.
 */
public class OpenDoorCreator extends GameCreator {
    @Override
    public Game crateGame() {

        return new OpenDoor();
    }
}
