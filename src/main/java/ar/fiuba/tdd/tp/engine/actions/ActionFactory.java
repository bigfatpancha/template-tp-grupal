package ar.fiuba.tdd.tp.engine.actions;


/**
 * Created by pablo on 4/28/16.
 */
public class ActionFactory {

    public static Action createAction(String actionId) throws UnknownActionException {

        if (actionId.equalsIgnoreCase("move")) {
            return new MoveAction();
        } else if (actionId.equalsIgnoreCase("pick")) {
            return new PickAction();
        } else {
            throw new UnknownActionException(actionId);
        }

    }
}
