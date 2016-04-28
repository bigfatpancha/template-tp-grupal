package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.engine.actions.Action;
import ar.fiuba.tdd.tp.engine.actions.exceptions.UnknownActionException;
import ar.fiuba.tdd.tp.engine.actions.factory.ActionFactory;
import ar.fiuba.tdd.tp.engine.model.GameData;

/**
 * Created by samiloiza on 25/04/16.
 */
public class DamnObject extends Game {

    public DamnObject() {
        super();
    }

    @Override
    public boolean isGameOver() {
        //TODO
        return false;
    }

}