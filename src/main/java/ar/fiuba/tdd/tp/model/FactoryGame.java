package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.exceptions.GameNotFoundException;
import ar.fiuba.tdd.tp.model.creators.*;

/**
 * Created by samiloiza on 25/04/16.
 */
public class FactoryGame {

    public static GameCreator getFactory(String gameName) {

        if (gameName.equalsIgnoreCase("fetch_quest")) {
            return new FetchQuestCreator();
        } else if (gameName.equalsIgnoreCase("open_door")) {
            return new OpenDoorCreator();
        } else if (gameName.equalsIgnoreCase("hanoi_tower")) {
            return new HanoiTowerCreator();
        } else if (gameName.equalsIgnoreCase("damn_object")) {
            return new DamnObjectCreator();
        } else if (gameName.equalsIgnoreCase("wolf_goat_cabbage")) {
            return new WolfGoatCabbageCreator();
        } else {
            throw new GameNotFoundException("El juego requerido no se encuentra implementado.");
        }

    }

}
