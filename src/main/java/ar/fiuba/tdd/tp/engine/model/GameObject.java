package ar.fiuba.tdd.tp.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 4/25/16.
 */
public class GameObject extends GameEntity {

    private List<String> actions;


    public GameObject() {
        this.setId("");
        this.setPlace("");
        this.actions = new ArrayList<String>();
    }

    public List<String> getActions() {
        return this.actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public boolean isActionAllowed(String action) {
        return this.getActions().contains(action);
    }

}
