package ar.fiuba.tdd.tp.engine.conf;

/**
 * Created by pablo on 4/25/16.
 */
public class GamePlaceConfiguration extends GameConfiguration<GameObjectConfiguration> {

    /*
    private String placeId;

    private List<GameObjectConfiguration> objects;


    public GamePlaceConfiguration() {
        this.placeId = "";
        this.objects = new ArrayList<GameObjectConfiguration>();
    }


    public String getPlaceId() {
        return this.placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public List<GameObjectConfiguration> getObjects() {
        return this.objects;
    }

    public void setObjects(List<GameObjectConfiguration> objects) {
        this.objects = objects;
    }
*/

    public boolean isObjectInside(String objectId) {
        GameObjectConfiguration gameObject = new GameObjectConfiguration();
        gameObject.setId(objectId);
        return this.getChilds().contains(gameObject);
    }

}
