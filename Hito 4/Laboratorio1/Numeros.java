package ManejoDeColasHito4.ColaNumeros;

import Hito3.Pilanumeros;

public class Numeros {

    private int max;
    private int ini;
    private int fin;
    private int cNum [];

    public Numeros(int max){

        this.max = max;
        this.cNum = new int[this.max + 1];
        this.ini = 0;
        this.fin = 0;

    }

    public boolean esVacia(){

        if(this.ini == 0 && this.fin == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esLlena(){

        if(this.ini == this.max){
            return true;
        }else{
            return false;
        }
    }

    public int nroElem(){

        return fin - ini;
    }

    public void Adicionar(int nuevoElem){

        if(esLlena() == false){

            fin++;
            cNum[fin] = nuevoElem;

        }else{
            System.out.println(" la Cola de Numeros esta Llena ");
        }

    }

    public int eliminar(){

        int elementoeliminado = 0;


        if(this.esVacia()== false)
        {
            ini ++;
            elementoeliminado = cNum[ini];
            if(ini == fin ){
                ini= 0;
                fin = 0;
            }

        }else{
            System.out.println(" la Cola de Numeros esta Vacia ");
        }

        return  elementoeliminado;

    }

    public void Vaciar(Numeros Cola ){

        while(Cola.esVacia()== false){

            Adicionar(Cola.eliminar());
        }

    }



    public void Mostrar()
    {
        if(esVacia()== true){

            System.out.println(" la Cola esta Vacia ");
        }else{

            int elem = 0;
            System.out.println(" Mostrando datos de la Cola ");
            Numeros aux = new Numeros(max);
            while(esVacia()== false){

                elem = eliminar();
                aux.Adicionar(elem);
                System.out.println(" valor = " + elem);
            }
            Vaciar (aux);
        }
    }
}
