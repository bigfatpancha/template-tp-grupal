package ar.fiuba.tdd.tp.engine.conf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablo on 4/25/16.
 */
public class Game {

    private String gameName;

    private List<GamePlace> places;

    private List<String> subjects;

    private List<GameObject> objects;


    public Game() {
        this.gameName = "";
        this.places = new ArrayList<GamePlace>();
        this.subjects = new ArrayList<String>();
    }


    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
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

    public List<String> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


}
