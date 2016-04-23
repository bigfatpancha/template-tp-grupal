package ar.fiuba.tdd.tp.server;

import java.util.Scanner;

/*
 * Created by mariagustina on 23/04/16.
 */
public class UserInteracter {

    public UserInteracter(){

    }

    public String inputGame(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Bienvenidos! A continuacion ingrese el comando <load game “juego”> para iniciar alguno de los juegos disponibles");

        String inputEnter = reader.nextLine();
        return inputEnter;
    }
}
