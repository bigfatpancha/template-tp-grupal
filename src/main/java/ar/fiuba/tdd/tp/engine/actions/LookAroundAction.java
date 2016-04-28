package ar.fiuba.tdd.tp.engine.actions;

import ar.fiuba.tdd.tp.engine.model.GameCharacter;
import ar.fiuba.tdd.tp.engine.model.GameObject;
import ar.fiuba.tdd.tp.engine.model.GamePlace;

/**
 * Created by pablo on 4/28/16.
 */
public class LookAroundAction implements Action {

    public String doAction(GamePlace place, GameCharacter character, GameObject object) {
        return "There's a damn_object in the " + place.getId();
    }

}
