package ar.fiuba.tdd.tp.interaction;

import java.util.Scanner;

/*
 * Created by mariagustina on 23/04/16.
 */
public class UserInteractor {

    private Scanner reader;

    private UserInteractor() {
        this.reader = new Scanner(System.in, "UTF-8");
    }

    private static class UserInteracterHolder {
        private static final UserInteractor INSTANCE = new UserInteractor();
    }

    public static UserInteractor getInstance() {
        return UserInteracterHolder.INSTANCE;
    }


    public void handleClientInteraction() {
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
        System.out.println("Bienvenidos");
    }
}
