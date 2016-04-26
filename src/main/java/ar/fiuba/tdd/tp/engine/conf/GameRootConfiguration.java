package ar.fiuba.tdd.tp.engine.conf;

/**
 * Created by pablo on 4/25/16.
 */
public class GameRootConfiguration extends GameConfiguration<GameObjectConfiguration> {

/*
    private String gameName;

    private List<GamePlaceConfiguration> places;


    public GameRootConfiguration() {
        this.gameName = "";
        this.places = new ArrayList<GamePlaceConfiguration>();
    }


    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public List<GamePlaceConfiguration> getPlaces() {
        return this.places;
    }

    public void setPlaces(List<GamePlaceConfiguration> places) {
        this.places = places;
    }
*/
    private String initialPlaceId;

    public GameRootConfiguration() {
        super();
        this.initialPlaceId = "";
    }


    public String getInitialPlaceId() {
        return this.initialPlaceId;
    }

    public void setInitialPlaceId(String placeId) {
        this.initialPlaceId = placeId;
    }


}
