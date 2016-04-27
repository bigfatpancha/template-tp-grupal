package ar.fiuba.tdd.tp.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 4/25/16.
 */
public class Game {

    private String gameName;

    private List<GamePlace> places;

    private List<GameCharacter> characters;

    private List<GameObject> objects;


    public Game() {
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



}
