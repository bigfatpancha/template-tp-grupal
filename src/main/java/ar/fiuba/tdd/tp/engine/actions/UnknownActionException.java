package ar.fiuba.tdd.tp.engine.actions;

/**
 * Created by pablo on 4/28/16.
 */
public class UnknownActionException extends Exception {

    public UnknownActionException(String actionId) {
        super("La accion " + actionId + " es desconocida");
    }
}
