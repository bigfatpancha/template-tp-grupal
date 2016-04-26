package ar.fiuba.tdd.tp.model;

/**
 * Created by Lucía on 24/4/2016.
 */

public class FetchQuestGame extends Game {

   // private List<String> userListEvents;

    public FetchQuestGame(String gameName) {
        super(gameName);
    }

    public void continueGame() {
        System.out.println(this.lastUserEvent);
    }

    public void consultGameRules() {

    }
}
