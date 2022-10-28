package defensa_pilas_hito3;



public class PilaDeEstudiantes {


    private int max;
    private Estudiante[] estudiantes  ;
    private int tope;



    public PilaDeEstudiantes(int max){

        this.tope=0;
        this.max=max;
        estudiantes=new Estudiante[this.max+1];

    }

    public boolean esVacio(){
        if(tope==0){
            return true;
        }else{
            return false;
        }

    }

    public boolean esLlena(){

        if(tope==max){
            return true;
        }else{
            return false;
        }


    }

    public int nroElem(){
        return this.tope;


    }

    public void Adicionar(Estudiante nuevoitem){
        if(this.esLlena() == false){
            this.tope = this.tope + 1;
            this.estudiantes[this.tope] = nuevoitem;
        }else {
            System.out.println("la pila de Estudiantes esta llena ");
        }


    }
    public Estudiante eliminar(){

        Estudiante elementoeliminado= null;

        if(this.esVacio() == false){
            elementoeliminado = this.estudiantes[this.tope];
            this.tope = this.tope - 1;
        }else{
            System.out.println("la pila de Estudiantes esta vacia ");
        }

        return elementoeliminado;




    }
    public void llenar(){


    }

    public void Mostrar(){

        Estudiante elem = null;
        if(this.esVacio()== true){
            System.out.println("la pila esta vacia ");
        }else{
            System.out.println(" Mostrando la pila de Estudiantes ");
            PilaDeEstudiantes aux = new PilaDeEstudiantes(this.max);
            while( this.esVacio()==false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                elem.muestraEstudiante();
            }
            Vaciar(aux);
        }
    }

    public void Vaciar(PilaDeEstudiantes pila ){

        while(pila.esVacio()== false){

            Adicionar(pila.eliminar());
        }


    }


}
