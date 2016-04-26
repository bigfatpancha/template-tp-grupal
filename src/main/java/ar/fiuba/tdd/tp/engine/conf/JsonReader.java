package ar.fiuba.tdd.tp.engine.conf;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by pablo on 4/26/16.
 */
public class JsonReader {


    public static void main(String[] args) {


        System.out.println("JSON READER INIT");
/*        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

        try {

            String path = "configFiles/gameConf.json";
            InputStreamReader jsonFile = new InputStreamReader(new FileInputStream(path), "UTF-8");

            GameRootConfiguration gameConf = gson.fromJson(jsonFile, GameRootConfiguration.class);
            if (gameConf != null) {
                System.out.println("JSON READER SUCCESSFUL");
            }

            System.out.println("JSON READER END");

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }


}
