package ar.fiuba.tdd.tp.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mariagustina on 23/04/16.
 */
public class GameRules {

    private Map<String,String> rules;

    public GameRules() {

    }

    public void load(String gameName) {

        //TODO: Levantarlo del json como diccionario de diccionarios!

        //Map<String, Map<String,String>> map1 = new HashMap<String, String>();

        Map<String,String> map2 = new HashMap<String, String>();

        map2.put("event1", "look around");

        map2.put("event2", "pick stick");

        this.rules = map2;

        //map1.put("UserEvents", map2);

        //System.out.println(map.get("dog"));

        System.out.print(this.rules);
    }
}


