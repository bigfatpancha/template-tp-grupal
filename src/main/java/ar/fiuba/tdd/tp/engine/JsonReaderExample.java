package ar.fiuba.tdd.tp.engine;

import ar.fiuba.tdd.tp.engine.conf.GameConfigurationReader;
import ar.fiuba.tdd.tp.engine.conf.GameNotFoundException;
import ar.fiuba.tdd.tp.engine.model.Game;

/**
 * Created by pablo on 4/27/16.
 */
public class JsonReaderExample {

    public static void main(String[] args) {

        try {
            GameConfigurationReader.getInstance().readGameConfiguration("gameConf");
            System.out.println("Configuracion del juego leida exitosamente!");
        } catch (GameNotFoundException e) {
            e.printStackTrace();
        }


    }
}
