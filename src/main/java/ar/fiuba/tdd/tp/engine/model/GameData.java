package ar.fiuba.tdd.tp.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 4/25/16.
 */
public class GameData {

    private String gameName;

    private String currentPlace;

    private List<GamePlace> places;

    private List<GameCharacter> characters;

    private List<GameObject> objects;


    public GameData() {
        this.gameName = "";
        this.places = new ArrayList<GamePlace>();
        this.characters = new ArrayList<GameCharacter>();
    }


    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public List<GameCharacter> getCharacters() {
        return this.characters;
    }

    public void setCharacters(List<GameCharacter> characters) {
        this.characters = characters;
    }

    public List<GameObject> getObjects() {
        return this.objects;
    }

    public void setObjects(List<GameObject> objects) {
        this.objects = objects;
    }

    public List<GamePlace> getPlaces() {
        return this.places;
    }

    public void setPlaces(List<GamePlace> places) {
        this.places = places;
    }


    public GamePlace getCurrentPlace() {
        GamePlace gamePlace = null;

        for (GamePlace place : this.places) {
            if (this.currentPlace.equalsIgnoreCase(place.getId())) {
                gamePlace = place;
            }
        }

        return gamePlace;
    }

    public List<GameObject> getObjectsInActualPlace(String placeId) {

        List<GameObject> gameObjectsInPlace = new ArrayList<GameObject>();

        for (GameObject gameObject : this.objects) {
            if (gameObject.getPlace().equalsIgnoreCase(placeId)) {
                gameObjectsInPlace.add(gameObject);
            }
        }

        return gameObjectsInPlace;
    }


    public GameObject getObjectById(String objectId) {
        GameObject object = null;

        for (GameObject gameObject : this.objects) {
            if (gameObject.getId().equalsIgnoreCase(objectId)) {
                object = gameObject;
            }
        }

        return object;
    }

}
