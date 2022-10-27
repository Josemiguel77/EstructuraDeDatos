package Campeonato.Clase;

public class Main {

    public static void main (String[] args ){

    Jugador J1 = new Jugador(" Jose " , " Quispeert " , " 12345678LP " ,  15);
   //J1.mostrarJugador();

        Jugador J2 = new Jugador(" Joyanh " , " Onono " , " 1234dfdfLP " ,  12);

  Jugador[] jugadores= new Jugador[2];
  jugadores[0] = J1;
  jugadores[1] = J2;


        Equipo Equi1 = new Equipo(" SALVADOR " , " VARONES " , jugadores);
        //Equi1.mostrarEquipo();


        Equipo[] equipos= new Equipo[1];
        equipos[0] = Equi1;


   Campeonato C1= new Campeonato(" LOS TELETUBIS " , equipos );
   C1.mostrarCampeonato();


    }
}
