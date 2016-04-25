package ar.fiuba.tdd.tp.interaction;

import java.util.Scanner;

/*
 * Created by mariagustina on 23/04/16.
 */
public class UserInteracter {

    private Scanner reader;

    public UserInteracter() {

        this.reader = new Scanner(System.in, "UTF-8");
    }

    public final String inputGame() {
          // Reading from System.in
        System.out.println("Bienvenidos! A continuacion ingrese el "
                +
                "comando <load game [juego]> para iniciar alguno de los juegos disponibles");
        return this.reader.nextLine();
    }

    public void handleCLientInteraction() {
        String input = this.reader.nextLine();
        if (input.equals("exit game")) {
            return;
        }

        if (input.equals("help")) {
            //TODO: Mostrar ayuda del juego
            System.out.println("Game helper");
        }
    }
}
