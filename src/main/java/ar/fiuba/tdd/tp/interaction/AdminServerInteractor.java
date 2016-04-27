package ar.fiuba.tdd.tp.interaction;

import java.util.Scanner;

/**
 * Created by nahuesosa on 26/04/2016.
 */
public class AdminServerInteractor {

    private Scanner reader;

    private static AdminServerInteractor INSTANCE = new AdminServerInteractor();

    public static AdminServerInteractor getInstance() {
        return INSTANCE;
    }

    private AdminServerInteractor() {
        this.reader = new Scanner(System.in, "UTF-8");
    }

    public void welcome() {
        System.out.println("Bienvenidos! A continuacion ingrese el comando "
                + "<load game [juego]> para iniciar alguno de los juegos disponibles: ");
    }

    public void printLoadInfo(String gameName, int port) {
        System.out.println(gameName + " loaded and listening on port " + port + ".");
    }

    public String handleAdminEvent() {
        String input = this.reader.nextLine();
        String[] parsedStr = input.split(" ");
        while (parsedStr.length < 3 || !"load".equals(parsedStr[0]) || !"game".equals(parsedStr[1])) {
            System.out.println("Comando incorrecto. Ingrese <load game [juego]> "
                    + "para iniciar alguno de los juegos disponibles");
            input = this.reader.nextLine();
            parsedStr = input.split(" ");
        }
        //TODO: poner los distintos juegos para que los cargue y que lo valide en el string
        return parsedStr[2];
    }

}
