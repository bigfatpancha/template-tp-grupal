package ar.fiuba.tdd.tp.model;

/**
 * Created by Lucía on 23/4/2016.
 */
public class FetchQuestCreator extends GameCreator {

    @Override
    public Game createGame() {

        return new FetchQuestGame();
    }
}
