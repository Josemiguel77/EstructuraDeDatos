package Campeonato.Clase;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese datos de los jugadores ");


        String nombreCompleto, apellidos, ci;
        int edad ,i ;

        int nJugadres = 3;

        Jugador[] jugadores = new Jugador[nJugadres];

        for ( i=0; i<nJugadres ; i++ ){

            System.out.print("Ingrese Nombre del Jugador " + (i+1) + ": ");
            nombreCompleto = leer.next();
            System.out.print(" Ingrese Apellido del Jugador " + (i+1) + ": ");
            apellidos = leer.next();
            System.out.print(" Ingrese el ci del Jugador " + (i+1) + ": ");
            ci = leer.next();
            System.out.print(" Ingrese la edad del Jugador " + (i+1) + ": ");
            edad = leer.nextInt();

            Jugador jug = new Jugador();
            jug.setNombreCompleto(nombreCompleto);
            jug.setApellido(apellidos);
            jug.setci(ci);
            jug.setEdad(edad);



            jugadores[i] = jug;

            System.out.println("");
        }

        Equipo eq1 = new Equipo(" bolivar " , " Varones " , jugadores);
        eq1.mostrarEquipo();



        //CREAR UN CAMPEONATO DE NOMBRE UNIFRANZITOS
        //ESTE CAMPEONATO DEBE DE TENER INSCRITO A DOS EQUIPOS
        // LOS EQUIPOS DEBEN SER 2
        // CADA EQUIPO DEBE TENER 3 JUGADORES
        // NOTA: TODOS LOS VALORES DEBEN SER LEIDOS DESDE CONSOLA
        // NOTA2: EVITE DUPLICAR CODIGO , CONSIDERE USAR BUCLES,

    }
}
