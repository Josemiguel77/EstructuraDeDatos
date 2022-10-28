package defensa_pilas_hito3;

public class Estudiante {


    private String nombres;
    private String apellidos;
    private int edad;
    private String sede;
    private int notaFinal;
    private String ci;

    public Estudiante(String nombres , String apellidos , int edad , String sede , int notaFinal , String ci)
    {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sede = sede;
        this.notaFinal = notaFinal;
        this.ci = ci;

    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getSede() {
        return sede;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getCi() {
        return ci;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void muestraEstudiante(){

        System.out.println(" \n MOSTRANDO ESTUDIANTES ");
        System.out.println(" nombres: " + this.getNombres());
        System.out.println(" apellidos: " + this.getApellidos());
        System.out.println(" edad: " + this.getEdad());
        System.out.println(" sede: " + this.getSede());
        System.out.println(" notafinal: " + this.getNotaFinal());
        System.out.println(" ci: " + this.getCi());

    }




}
