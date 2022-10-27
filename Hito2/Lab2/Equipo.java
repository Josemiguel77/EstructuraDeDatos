package Campeonato.Clase;



public class Equipo {

    private String nombreEquipo;
    public String categoria;
    private Jugador[] jugadores;

    public Equipo(String nombreEquipo , String categoria , Jugador[] jugadores){

        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.jugadores = jugadores;

    }

    public String getNombreEquipo(){

        return this.nombreEquipo;
    }

    public String getCategoria(){

        return this.categoria;
    }

    public Jugador[] getJugadores() {
        return this.jugadores;
    }

    public void setNombreEquipo(String nuevonombreEquipo) {
        this.nombreEquipo = nuevonombreEquipo;
    }

    public void setCategoria(String nuevacategoria) {
        this.categoria = nuevacategoria;
    }

    public void setJugadores(Jugador[] nuevojugadores) {
        this.jugadores = nuevojugadores;
    }

    public void mostrarEquipo(){

        System.out.println("\n MOSTRANDO DATOS DEL EQUIPO");
        System.out.println("Nombre del equipo" + this.getNombreEquipo());
        System.out.println("Categoria del equipo" + this.getCategoria());

        for (int i=0; i< this.getJugadores() .length ;i++ ){

            this.getJugadores()[i].mostrarJugador();

        }
    }










}
