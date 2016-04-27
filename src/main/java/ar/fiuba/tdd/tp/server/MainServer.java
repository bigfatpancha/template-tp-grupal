package ar.fiuba.tdd.tp.server;

import ar.fiuba.tdd.tp.interaction.AdminServerInteractor;
import ar.fiuba.tdd.tp.model.Engine;
import ar.fiuba.tdd.tp.model.creators.EngineCreator;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Martín on 26/04/2016.
 */
public class MainServer {

    private List<Engine> engines;

    public MainServer() {
        this.engines = new ArrayList<Engine>();
    }

    public void addEngine(Engine engine) {
        this.engines.add(engine);
    }

    public static void main(String[] args) {

        int port = 5050;
        AdminServerInteractor interactor = AdminServerInteractor.getInstance();
        interactor.welcome();
        MainServer mainServer = new MainServer();

        while (true) {
            EngineCreator engineCreator = new EngineCreator();
            String inputGameName = interactor.handleAdminEvent();
            Engine engine;
            try {
                engineCreator.addGame(inputGameName);
                engineCreator.addListener(port);
                engine = engineCreator.createEngine();
            } catch (Exception e) {
                System.out.println(e.getMessage() + " Intente nuevamente.");
                continue;
            }

            engine.start();
            interactor.printLoadInfo(inputGameName, port);
            mainServer.addEngine(engine);
            port++;
        }

    }

}
