package ar.fiuba.tdd.tp;


import ar.fiuba.tdd.tp.engine.actions.Action;
import ar.fiuba.tdd.tp.engine.actions.MoveAction;
import ar.fiuba.tdd.tp.engine.actions.PickAction;
import ar.fiuba.tdd.tp.engine.actions.exceptions.UnknownActionException;
import ar.fiuba.tdd.tp.engine.actions.factory.ActionFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ljulia on 28/04/2016.
 */
public class CreateActionTest {

    @Test
    public void createPickAction() {
        try {
            Action action = ActionFactory.getInstance().createAction(ActionFactory.ActionType.pick);
            assertEquals(action.getClass(), PickAction.class);
        } catch (UnknownActionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void createMoveAction() {
        try {
            Action action = ActionFactory.getInstance().createAction(ActionFactory.ActionType.move);
            assertEquals(action.getClass(), MoveAction.class);
        } catch (UnknownActionException e) {
            e.printStackTrace();
        }
    }

}
