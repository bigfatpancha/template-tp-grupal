package ar.fiuba.tdd.tp.model.creators;

import ar.fiuba.tdd.tp.engine.conf.GameConfigurationReader;
import ar.fiuba.tdd.tp.engine.conf.GameNotFoundException;
import ar.fiuba.tdd.tp.engine.model.GameData;
import ar.fiuba.tdd.tp.model.FetchQuestGame;
import ar.fiuba.tdd.tp.model.Game;

/**
 * Created by Lucía on 23/4/2016.
 */
public class FetchQuestCreator extends GameCreator {

    @Override
    public Game createGame() {
        FetchQuestGame game = new FetchQuestGame();

        try {
            GameData gameData = GameConfigurationReader.getInstance().readGameConfiguration(FetchQuestGame.GAME_NAME);
            game.setGameData(gameData);
        } catch (GameNotFoundException e) {
            throw new ar.fiuba.tdd.tp.exceptions.GameNotFoundException(e.getMessage());
        }

        return game;
    }
}
