package ar.fiuba.tdd.tp.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 4/27/16.
 */
public class GameCharacter extends GameEntity {

    private List<String> inventory;

    public GameCharacter() {
        this.setId("");
        this.setPlace("");
        this.inventory = new ArrayList<String>();
    }

    public void addObjectToInventory(String object) {
        this.inventory.add(object);
    }

    public boolean isObjectInInventory(String objectId) {
        return this.inventory.contains(objectId);
    }

}
