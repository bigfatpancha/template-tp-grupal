package ar.fiuba.tdd.tp.model.creators;

import ar.fiuba.tdd.tp.model.FetchQuestGame;
import ar.fiuba.tdd.tp.model.Game;

/**
 * Created by Lucía on 23/4/2016.
 */
public class FetchQuestCreator extends GameCreator {

    @Override
    public Game createGame() {

        return new FetchQuestGame();
    }
}
