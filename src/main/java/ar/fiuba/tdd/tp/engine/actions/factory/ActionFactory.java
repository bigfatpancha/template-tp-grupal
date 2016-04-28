package ar.fiuba.tdd.tp.engine.actions.factory;


import ar.fiuba.tdd.tp.engine.actions.Action;
import ar.fiuba.tdd.tp.engine.actions.MoveAction;
import ar.fiuba.tdd.tp.engine.actions.PickAction;
import ar.fiuba.tdd.tp.engine.actions.exceptions.UnknownActionException;

/**
 * Created by pablo on 4/28/16.
 */
public class ActionFactory {

    private static ActionFactory instance;

    private ActionFactory() { }


    public static ActionFactory getInstance() {
        if (instance == null) {
            instance = new ActionFactory();
        }

        return instance;
    }


    public Action createAction(String actionId) throws UnknownActionException {

        if (actionId.equalsIgnoreCase("move")) {
            return new MoveAction();
        } else if (actionId.equalsIgnoreCase("pick")) {
            return new PickAction();
        } else {
            throw new UnknownActionException(actionId);
        }

    }
}
