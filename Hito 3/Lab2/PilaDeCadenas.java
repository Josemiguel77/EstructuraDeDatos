package PilaDeCadenas;


public class PilaDeCadenas {

    private int max;
    private String [] Nombres ;
    private int tope;



    public PilaDeCadenas(int max){

        this.tope=0;
        this.max=max;
        Nombres=new String[this.max+1];

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

    public void Adicionar(String nuevoitem){
        if(this.esLlena() == false){
            this.tope = this.tope + 1;
            this.Nombres[this.tope] = nuevoitem;
        }else {
            System.out.println("la pila de Nombres(cadenas) esta llena ");
        }


    }
    public String eliminar(){

        String elementoeliminado= "";

        if(this.esVacio() == false){
            elementoeliminado = this.Nombres[this.tope];
            this.tope = this.tope - 1;
        }else{
            System.out.println("la pila de Nom esta vacia ");
        }

        return elementoeliminado;




    }
    public void llenar(){


    }

    public void Mostrar(){

        String elem = "";
        if(this.esVacio()== true){
            System.out.println("la pila esta vacia ");
        }else{
            System.out.println(" datos de la pila ");
            PilaDeCadenas aux = new PilaDeCadenas(this.max);
            while( this.esVacio()==false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                System.out.println("Elemento : " + elem);
            }
            Vaciar(aux);
        }
    }

    public void Vaciar(PilaDeCadenas a ){

        while(a.esVacio()== false){

            Adicionar(a.eliminar());
        }


    }

}
