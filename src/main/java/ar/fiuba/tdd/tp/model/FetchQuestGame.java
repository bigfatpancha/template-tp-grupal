package ar.fiuba.tdd.tp.model;

/**
 * Created by Lucía on 24/4/2016.
 */

public class FetchQuestGame extends Game {

    public FetchQuestGame() {
        super();
    }

    @Override
    public Game loadRules(String gameName) {
        return super.loadRules(gameName);
        // private List<String> userListEvents;
    }

    public void continueGame() {
        System.out.println(this.lastUserEvent);
    }

    public void consultGameRules() {

    }
}
