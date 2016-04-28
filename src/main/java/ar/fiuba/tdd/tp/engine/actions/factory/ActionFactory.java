package ar.fiuba.tdd.tp.engine.actions.factory;


import ar.fiuba.tdd.tp.engine.actions.*;
import ar.fiuba.tdd.tp.engine.actions.exceptions.UnknownActionException;

/**
 * Created by pablo on 4/28/16.
 */
public class ActionFactory {

    public enum ActionType {
        move, pick, look_around, open
    }

    private static ActionFactory instance;

    private ActionFactory() { }


    public static ActionFactory getInstance() {
        if (instance == null) {
            instance = new ActionFactory();
        }

        return instance;
    }


    public Action createAction(ActionType actionId) throws UnknownActionException {

        switch (actionId) {
            case move :
                return new MoveAction();
            case pick :
                return new PickAction();
            case look_around :
                return new LookAroundAction();
            case open :
                return new OpenDoorAction();
            default :
                throw new UnknownActionException(actionId.name());
        }

    }
}
