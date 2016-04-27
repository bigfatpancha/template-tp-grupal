package ar.fiuba.tdd.tp.exceptions;

/**
 * Created by Martín on 26/04/2016.
 */
public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(String message) {
        super(message);
    }
}
