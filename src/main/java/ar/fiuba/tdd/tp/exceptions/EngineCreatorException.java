package ar.fiuba.tdd.tp.exceptions;

/**
 * Created by Martín on 26/04/2016.
 */
public class EngineCreatorException extends RuntimeException {

    public EngineCreatorException() {
    }

    public EngineCreatorException(String message) {
        super(message);
    }

    public EngineCreatorException(Throwable cause) {
        super(cause);
    }
}
