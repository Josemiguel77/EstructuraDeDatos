package Campeonato.Clase;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese datos de los jugadores ");

        String nombreCompleto1, apellidos1, ci1;
        int edad1;



        System.out.print(" Ingrese Nombre del Jugador1: ");
        nombreCompleto1 = leer.next();
        System.out.print(" Ingrese Apellido del Jugador1: ");
        apellidos1 = leer.next();
        System.out.print(" Ingrese el ci del Jugador1: ");
        ci1 = leer.next();
        System.out.print(" Ingrese la edad del Jugador1: ");
        edad1 = leer.nextInt();

        //Jugador jug1 = new Jugador(nombreCompleto1 , apellidos1 , ci1 , edad1 );
        //jug1.mostrarJugador();


        Jugador jug1 = new Jugador();
        jug1.setNombreCompleto(nombreCompleto1);
        jug1.setApellido(apellidos1);
        jug1.setci(ci1);
        jug1.setEdad(edad1);

        jug1.mostrarJugador();



        String nombreCompleto2, apellidos2, ci2;
        int edad2;



        System.out.print(" Ingrese Nombre del Jugador2: ");
        nombreCompleto2 = leer.next();
        System.out.print(" Ingrese Apellido del Jugador2: ");
        apellidos2 = leer.next();
        System.out.print(" Ingrese el ci del Jugador2: ");
        ci2 = leer.next();
        System.out.print(" Ingrese la edad del Jugador2: ");
        edad2 = leer.nextInt();

        //Jugador jug1 = new Jugador(nombreCompleto1 , apellidos1 , ci1 , edad1 );
        //jug1.mostrarJugador();


        Jugador jug2 = new Jugador();
        jug2.setNombreCompleto(nombreCompleto2);
        jug2.setApellido(apellidos2);
        jug2.setci(ci2);
        jug2.setEdad(edad2);

        jug2.mostrarJugador();











    }
}

