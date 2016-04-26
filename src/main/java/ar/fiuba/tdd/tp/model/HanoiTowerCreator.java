package ar.fiuba.tdd.tp.model;

/**
 * Created by samiloiza on 25/04/16.
 */
public class HanoiTowerCreator extends GameCreator {
    @Override
    public Game createGame() {

        return new HanoiTower();
    }
}
