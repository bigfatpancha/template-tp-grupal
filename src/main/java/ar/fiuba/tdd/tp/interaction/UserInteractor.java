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


    public String handleHelpInteraction(String gameName) {
        if ( gameName.equals("fetch_quest") ) {
            return "Fetch_quest help:"
                    +
                "\nwrite exit to go out of the game"
                    +
                "\nto play yo can do two things:"
                    +
                "\nwrite look around: to look which objects do you have in a place"
                    +
                "\nwrit pick + object: to pick an objeck"
                    +
                "\ngood luck!";
        }

        return "We are sorry, that game is not available in this server";
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
