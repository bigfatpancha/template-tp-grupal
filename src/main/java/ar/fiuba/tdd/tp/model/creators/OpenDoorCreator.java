package ar.fiuba.tdd.tp.model.creators;

import ar.fiuba.tdd.tp.model.Game;
import ar.fiuba.tdd.tp.model.OpenDoor;

/**
 * Created by samiloiza on 25/04/16.
 */
public class OpenDoorCreator extends GameCreator {
    @Override
    public Game createGame() {
        return new OpenDoor();
    }
}
