package ar.fiuba.tdd.tp.interaction;

import java.util.Scanner;

/*
 * Created by mariagustina on 23/04/16.
 */
public class UserInteracter {

    //TODO: hacerlo singleton
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
            return;

        }
    }

    public String handleUserEvent() {
        System.out.println("Esperando al control de usuario");

        String input = this.reader.nextLine();
        return input;
    }

    public void printControllersGame() {
        //TODO: en el json ponerle una descripcion con los controles que sean necesarios, lo dejo hardcodeado por ahora
        System.out.println("Bienvenidos al juego FetchQuest! "
                +
                "los controles para el juego son: \n"
                +
                 "q: look around \n"
                +
                 "w: pick stick \n");

    }
}
