package Campeonato.Clase;

import java.sql.SQLOutput;

public class Campeonato {

    private String nombreCampeonato;
    private Equipo[] equipos;

    public Campeonato(String nombreCampeonato , Equipo[] equipos ){

        this.nombreCampeonato = nombreCampeonato;
        this.equipos = equipos;



    }

    public String getNombreCampeonato() {
        return this.nombreCampeonato;
    }

    public Equipo[] getEquipos() {
        return this.equipos;
    }

    public void setNombreCampeonato(String nuevonombreCampeonato) {
        this.nombreCampeonato = nuevonombreCampeonato;
    }

    public void setEquipos(Equipo[] nuevoequipos) {
        this.equipos = nuevoequipos;
    }

    public void mostrarCampeonato(){

        System.out.println("\n MOSTRANDO DATOS DEl CAMPEONATO");
        System.out.println(" Nombre del Campeonato " + this.getNombreCampeonato());

        for (int i=0; i< this.getEquipos() .length ;i++ ){

            this.getEquipos()[i].mostrarEquipo();

        }

    }






}
