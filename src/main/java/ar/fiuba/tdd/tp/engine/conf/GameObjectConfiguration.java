package ar.fiuba.tdd.tp.engine.conf;

/**
 * Created by pablo on 4/25/16.
 */
public class GameObjectConfiguration extends GameConfiguration<String> {
/*
    private String objectId;

    private List<String> actions;


    public GameObjectConfiguration() {
        this.objectId = "";
        this.actions = new ArrayList<String>();
    }


    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public List<String> getActions() {
        return this.actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }
*/
    public boolean isActionAllowed(String action) {
        return this.getChilds().contains(action);
    }

}
