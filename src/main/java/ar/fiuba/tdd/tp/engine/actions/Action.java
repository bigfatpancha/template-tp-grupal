package ar.fiuba.tdd.tp.engine.actions;

import ar.fiuba.tdd.tp.engine.model.GameCharacter;
import ar.fiuba.tdd.tp.engine.model.GameObject;
import ar.fiuba.tdd.tp.engine.model.GamePlace;

/**
 * Created by pablo on 4/27/16.
 */
public interface Action {

    String doAction(GamePlace place, GameCharacter character, GameObject object);
}
