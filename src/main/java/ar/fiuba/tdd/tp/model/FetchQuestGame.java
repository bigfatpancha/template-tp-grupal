package ar.fiuba.tdd.tp.model;

//import com.sun.org.apache.bcel.internal.generic.RETURN;

import ar.fiuba.tdd.tp.engine.actions.Action;
import ar.fiuba.tdd.tp.engine.actions.exceptions.UnknownActionException;
import ar.fiuba.tdd.tp.engine.actions.factory.ActionFactory;
import ar.fiuba.tdd.tp.engine.model.GameData;

/**
 * Created by Lucía on 24/4/2016.
 */

public class FetchQuestGame extends Game {

    public static final String GAME_NAME = "fetch_quest";

    public FetchQuestGame() {
        super();
    }

    public String processMessage(String message) {

        String[] actionObject = message.split(" ");

        String actionId = actionObject[0];
        String objectId = actionObject[1];

        try {
            Action action = ActionFactory.getInstance().createAction(actionId);
            GameData gameData = this.getGameData();

            return action.doAction(gameData.getCurrentPlace(), gameData.getCharacters().get(0), gameData.getObjectById(objectId));
        } catch (UnknownActionException e) {
            return "Unknown action";
        }
    }

    public boolean isGameOver() {
        return this.getGameData().getCharacters().get(0).isObjectInInventory("stick");
    }
}
