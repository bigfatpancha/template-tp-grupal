package ar.fiuba.tdd.tp.model;

/**
 * Created by samiloiza on 25/04/16.
 */
public class HanoiTower extends Game {
    public HanoiTower() {
        super();
    }

    /*
    @Override
    public String processMessage(String message) {
        return "HanoiTower:" + message;
    } */

    public void continueGame() {
        System.out.println("continue GameData Hanoi");
    }

    public void consultGameRules() {
        //T System.out.println("consult Hanoi");
    }

    public String processMessage(String message) {
        return "Game process:" + message;
    }

}
