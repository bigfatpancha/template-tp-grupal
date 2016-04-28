package ar.fiuba.tdd.tp.engine.actions.exceptions;

/**
 * Created by pablo on 4/28/16.
 */
public class InvalidActionException extends Exception {

    public InvalidActionException(String actionId, String objectId) {
        super("You can not " + actionId + " a " + objectId);
    }
}
