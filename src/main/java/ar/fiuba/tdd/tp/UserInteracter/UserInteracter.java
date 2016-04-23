package ar.fiuba.tdd.tp.UserInteracter;

import java.util.Scanner;

/*
 * Created by mariagustina on 23/04/16.
 */
public class UserInteracter {

    private Scanner reader;
    public UserInteracter(){
       this.reader = new Scanner(System.in);
    }

    public String inputGame(){
          // Reading from System.in
        System.out.println("Bienvenidos! A continuacion ingrese el comando <load game “juego”> para iniciar alguno de los juegos disponibles");

        String inputEnter = this.reader.nextLine();
        return inputEnter;
    }

    public void handleCLientInteraction(){
        String input = this.reader.nextLine();
        if (input.equals("exit game")){
            return;
        }

        if (input.equals("help")) {
            //TODO: Mostrar ayuda del juego
        }
    }
}
