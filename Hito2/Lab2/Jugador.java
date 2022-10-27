package Campeonato.Clase;

public class Jugador {

    private String nombreCompleto;
    private String apellido;
    private String ci;
    private  int edad;

    public Jugador(String nombreCompleto , String apellido , String ci , int edad)
    {

        this.nombreCompleto = nombreCompleto;
        this.apellido = apellido;
        this.ci = ci;
        this.edad = edad;

    }

    public Jugador (){

        this.nombreCompleto = "";
        this.apellido = "";
        this.ci = "";
        this.edad = 0;

    }

    public String getNombreCompleto(){

        return this.nombreCompleto;

    }

    public String getApellido(){

        return this.apellido;

    }

    public String getci(){

        return this.ci;

    }

    public int getEdad(){

        return this.edad;

    }

    public void setNombreCompleto(String nuevoNombre) {
        this.nombreCompleto = nuevoNombre;
    }

    public void setApellido(String nuevoapellido) {
        this.apellido = nuevoapellido;
    }

    public void setci(String nuevoci) {
        this.ci = nuevoci;
    }

    public void setEdad(int nuevaedad) {
        this.edad = nuevaedad;
    }

    public void mostrarJugador(){

        System.out.println(" \n MOSTRANDO DATOS DEL JUGADOR ");
        System.out.println("Nombre del jugador " + this.getNombreCompleto());
        System.out.println("Apellido del jugador " + this.getApellido());
        System.out.println("CI del jugador " + this.getci());
        System.out.println("Edad del jugador " + this.getEdad());

    }




}
