package ar.fiuba.tdd.tp.engine.actions;

import ar.fiuba.tdd.tp.engine.actions.Action;
import ar.fiuba.tdd.tp.engine.model.GameCharacter;
import ar.fiuba.tdd.tp.engine.model.GameObject;
import ar.fiuba.tdd.tp.engine.model.GamePlace;

/**
 * Created by Lucía on 28/4/2016.
 */
public class OpenDoorAction implements Action {
    @Override
    public String doAction(GamePlace place, GameCharacter character, GameObject object) {
        if (object.isActionAllowed("open")) {
            return object.getId() + " is now open";
        } else {
            return "You can not open " + object.getId();
        }
    }
}
