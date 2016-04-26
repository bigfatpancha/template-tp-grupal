package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.exceptions.GameNotFoundException;

/**
 * Created by samiloiza on 25/04/16.
 */
public class FactoryGame {

    public static GameCreator getFactory(String gameName) {

        if (gameName.equalsIgnoreCase("fetch_quest")) {
            return new FetchQuestCreator();
        } else if (gameName.equalsIgnoreCase("abrir_puerta")) {
            return new OpenDoorCreator();
        } else if (gameName.equalsIgnoreCase("torres_de_hanoi")) {
            return new HanoiTowerCreator();
        } else if (gameName.equalsIgnoreCase("objeto_maldito")) {
            return new DamnObjectCreator();
        } else {
            throw new GameNotFoundException("El juego requerido no se encuentra implementado.");
        }

    }

}
