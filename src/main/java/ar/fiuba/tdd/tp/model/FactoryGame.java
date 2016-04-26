package ar.fiuba.tdd.tp.model;

/**
 * Created by samiloiza on 25/04/16.
 */
public class FactoryGame {

    public static GameCreator getFactory(String gameName) {

        if (gameName.equalsIgnoreCase("fetch quest")) {
            return new FetchQuestCreator();
        } else if (gameName.equalsIgnoreCase("abrir puerta")) {
            return new OpenDoorCreator();
        } else if (gameName.equalsIgnoreCase("torres de hanoi")) {
            return new HanoiTowerCreator();
        } else if (gameName.equalsIgnoreCase("objeto maldito")) {
            return new DamnObjectCreator();
        } else {
            return new FetchQuestCreator();
        }

    }

}
