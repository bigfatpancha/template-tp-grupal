package ar.fiuba.tdd.tp.engine.actions;

import ar.fiuba.tdd.tp.engine.model.GameCharacter;
import ar.fiuba.tdd.tp.engine.model.GameObject;
import ar.fiuba.tdd.tp.engine.model.GamePlace;

/**
 * Created by pablo on 4/27/16.
 */
public class PickAction implements Action {

    public String doAction(GamePlace place, GameCharacter character, GameObject object) {

        if (object.isActionAllowed("pick")) {
            character.addObjectToInventory(object.getId());
            return object.getId() + " picked up from " + place.getId();
        } else {
            return "You can not pick up the " + object.getId();
        }
    }

}
