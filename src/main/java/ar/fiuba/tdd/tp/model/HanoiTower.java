package ar.fiuba.tdd.tp.model;

/**
 * Created by samiloiza on 25/04/16.
 */
public class HanoiTower extends Game {
    public HanoiTower() {
        super();
    }

    @Override
    public Game loadRules(String gameName) {
        return super.loadRules(gameName);
    }

    public void continueGame() {
        System.out.println("continue Game Hanoi");
    }

    public void consultGameRules() {
       //T System.out.println("consult Hanoi");
    }
}