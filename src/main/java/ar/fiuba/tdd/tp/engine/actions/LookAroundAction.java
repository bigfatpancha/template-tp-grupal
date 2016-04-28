package ar.fiuba.tdd.tp.engine.actions;

import ar.fiuba.tdd.tp.engine.model.GameObject;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by pablo on 4/28/16.
 */

public class LookAroundAction {
    private String objectsInRoom;

    public  LookAroundAction() {
        this.objectsInRoom = "";
    }

    public String doAction(List<GameObject> objets) {
        setobjectsInRoom(objets);
        String objectsString = (objets.size() == 1) ? "There is " : "There are ";
        objectsString += this.objectsInRoom;
        objectsString +=  " in the room";
        return objectsString;
    }

    private void setobjectsInRoom(List<GameObject> objets) {
        for (ListIterator<GameObject> iter = objets.listIterator(); iter.hasNext(); ) {
            GameObject element = iter.next();
            this.objectsInRoom += "a ";
            this.objectsInRoom += (element.getId());
        }
    }

}
