package ar.fiuba.tdd.tp.engine.conf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ar.fiuba.tdd.tp.engine.model.Game;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * Created by pablo on 4/26/16.
 */
public class GameConfigurationReader {

    private static GameConfigurationReader instance;

    private GameConfigurationReader() { }


    public static GameConfigurationReader getInstance() {
        if (instance == null) {
            instance = new GameConfigurationReader();
        }

        return instance;
    }


    public Game readGameConfiguration(String gameName) throws GameNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

        try {

            String path = System.getProperty("user.dir") + "/src/configFiles/" + gameName + ".json";

            InputStreamReader jsonFile = new InputStreamReader(new FileInputStream(path), "UTF-8");

            Game game = gson.fromJson(jsonFile, Game.class);
            System.out.println("Configuracion del juego \'" + gameName + "\' leida exitosamente!");

            return game;

        } catch (IOException e) {
            throw new GameNotFoundException("No se ha encontrado el juego requerido");
        }

    }


}
