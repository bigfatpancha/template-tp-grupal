package ar.fiuba.tdd.tp.model;

import ar.fiuba.tdd.tp.engine.actions.Action;
import ar.fiuba.tdd.tp.engine.actions.LookAroundAction;
import ar.fiuba.tdd.tp.engine.actions.exceptions.UnknownActionException;
import ar.fiuba.tdd.tp.engine.actions.factory.ActionFactory;
import ar.fiuba.tdd.tp.engine.conf.GameConfigurationReader;
import ar.fiuba.tdd.tp.engine.conf.GameNotFoundException;
import ar.fiuba.tdd.tp.engine.model.GameData;
import ar.fiuba.tdd.tp.interaction.UserInteractor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mariagustina on 23/04/16.
 */
public abstract class Game {

    private GameData gameData;
    private String lastUserEvent;
    private Map<String, ActionFactory.ActionType> actionMap;

    public void loadGame(String gameName) {
        this.loadMap();
        try {
            this.gameData = GameConfigurationReader.getInstance().readGameConfiguration(gameName);
        } catch (GameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public GameData getGameData() {
        return this.gameData;
    }

    public void setGameData(GameData gameData) {
        this.gameData = gameData;
    }

    private void loadMap() {
        this.actionMap = new HashMap<String, ActionFactory.ActionType>();
        this.actionMap.put("pick", ActionFactory.ActionType.pick);
        this.actionMap.put("move", ActionFactory.ActionType.move);
        this.actionMap.put("look_around", ActionFactory.ActionType.look_around);
        this.actionMap.put("open", ActionFactory.ActionType.open);
    }

    public Map<String, ActionFactory.ActionType> getActionMap() {
        return this.actionMap;
    }

    public void giveFirstMessage() {
        UserInteractor interacter = UserInteractor.getInstance();
        interacter.printControllersGame();
    }

    public void startGame() {
        UserInteractor interacter = UserInteractor.getInstance();
        this.lastUserEvent = interacter.handleUserEvent();
        System.out.println(this.lastUserEvent);
    }

    public String processMessage(String message) {

        String[] parsedStr = message.split(" ");
        while (parsedStr.length != 2) {
            return "Comando incorrecto. Ingrese una accion o ingrese help <juego> "
                    + "para obtener la ayuda del juego.";
        }

        String[] actionObject = message.split(" ");

        String actionId = actionObject[0];
        String objectId = actionObject[1];

        try {
            GameData gameData = this.getGameData();

            /* Caso particular para look around */
            if (actionObject[0].equals("look") &&  actionObject[1].equals("around")) {
                LookAroundAction lookAround = new LookAroundAction();
                return lookAround.doAction(this.getGameData().getObjects());
            }

            Action action = ActionFactory.getInstance().createAction(this.getActionMap().get(actionId));
            return action.doAction(gameData.getCurrentPlace(), gameData.getCharacters().get(0), gameData.getObjectById(objectId));

        } catch (UnknownActionException e) {
            return "Unknown action";
        }
    }

    public abstract boolean isGameOver();


}
