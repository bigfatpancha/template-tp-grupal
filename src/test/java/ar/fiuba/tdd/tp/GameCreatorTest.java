package ar.fiuba.tdd.tp;

import ar.fiuba.tdd.tp.model.*;
import ar.fiuba.tdd.tp.model.creators.GameCreator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ljulia on 28/04/2016.
 */
public class GameCreatorTest {

    @Test
    public void createFetchQuestGameTest() {
        GameCreator creator;
        creator = FactoryGame.getFactory("fetch_quest");
        Game game = creator.createGame();
        assertEquals(game.getClass(), FetchQuestGame.class);
    }

    @Test
    public void createDamnObjectTest() {
        GameCreator creator = FactoryGame.getFactory("damn_object");
        Game game = creator.createGame();
        assertEquals(game.getClass(), DamnObject.class);
    }

    @Test
    public void createOpenDoorTest() {
        GameCreator creator = FactoryGame.getFactory("open_door");
        Game game = creator.createGame();
        assertEquals(game.getClass(), OpenDoor.class);
    }

    @Test
    public void createHanoiTowerTest() {
        GameCreator creator = FactoryGame.getFactory("hanoi_tower");
        Game game = creator.createGame();
        assertEquals(game.getClass(), HanoiTower.class);
    }

    @Test
    public void createWolfGoatCabbageTest() {
        GameCreator creator = FactoryGame.getFactory("wolf_goat_cabbage");
        Game game = creator.createGame();
        assertEquals(game.getClass(), WolfGoatCabbage.class);
    }

}
