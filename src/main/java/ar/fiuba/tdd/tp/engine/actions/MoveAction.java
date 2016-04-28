package ar.fiuba.tdd.tp.engine.actions;

import ar.fiuba.tdd.tp.engine.model.GameCharacter;
import ar.fiuba.tdd.tp.engine.model.GameObject;
import ar.fiuba.tdd.tp.engine.model.GamePlace;

/**
 * Created by pablo on 4/27/16.
 */
public class MoveAction implements Action {

    public String doAction(GamePlace place, GameCharacter character, GameObject object) {

        String moveResponse = "";

        if (object != null) {
            object.setPlace(place.getId());
            moveResponse = object.getId() + " moved to " + place.getId();
        } else if (character != null) {
            character.setPlace(place.getId());
            moveResponse = character.getId() + " went to " + place.getId();
        }

        return moveResponse;
    }
}
