package ManejoDeColasHito4.ColaNumeros;


import Hito3.Pilanumeros;

public class Main {

    public static void main(String[] args) {


        Numeros n1 = new Numeros(10);

        n1.Adicionar(10);
        n1.Adicionar(5);
        n1.Adicionar(50);
        n1.Adicionar(37);
        n1.Adicionar(10);
        n1.Adicionar(50);


        //DeterminamuestraNumeroMenor(n1);
        //MenorValorAlPrincipio(n1);
        // MayorValorAlFinal(n1);
        ElimininarElementos(n1);

    }

    public static void DeterminamuestraNumeroMenor(Numeros cola) {

        Numeros aux = new Numeros(10);
        int menor = cola.eliminar();
        int valorExtraidoDelaPila = 0;
        aux.Adicionar(menor);

        while (cola.esVacia() == false) {

            valorExtraidoDelaPila = cola.eliminar();
            if (valorExtraidoDelaPila < menor) {

                menor = valorExtraidoDelaPila;
            }

            aux.Adicionar(valorExtraidoDelaPila);


        }

        cola.Vaciar(aux);

        System.out.println("el numero menor es: " + menor);

    }

    public static int Menorelem(Numeros cola) {

        Numeros aux = new Numeros(10);
        int menor = cola.eliminar();
        int valorExtraidoDelaPila = 0;
        aux.Adicionar(menor);

        while (cola.esVacia() == false) {

            valorExtraidoDelaPila = cola.eliminar();
            if (valorExtraidoDelaPila < menor) {

                menor = valorExtraidoDelaPila;
            }

            aux.Adicionar(valorExtraidoDelaPila);


        }

        cola.Vaciar(aux);
        return menor;
    }

    public static void MenorValorAlPrincipio(Numeros cola) {
        int menorValor = Menorelem(cola);
        int valorExtraidodelaCola;
        System.out.println(" Menor Valor " + menorValor);
        Numeros aux = new Numeros(10);
        while (!cola.esVacia()) {

            valorExtraidodelaCola = cola.eliminar();
            if (menorValor != valorExtraidodelaCola) {

                aux.Adicionar(valorExtraidodelaCola);
            }

        }

        cola.Adicionar(menorValor);
        cola.Vaciar(aux);
        cola.Mostrar();

    }

    public static int Mayorelem(Numeros cola) {

        Numeros aux = new Numeros(10);
        int mayor = cola.eliminar();
        int valorExtraidoDelaPila = 0;
        aux.Adicionar(mayor);

        while (cola.esVacia() == false) {

            valorExtraidoDelaPila = cola.eliminar();
            if (valorExtraidoDelaPila > mayor) {

                mayor = valorExtraidoDelaPila;
            }

            aux.Adicionar(valorExtraidoDelaPila);


        }

        cola.Vaciar(aux);
        return mayor;
    }

    public static void MayorValorAlFinal(Numeros cola) {
        int MayorValor = Mayorelem(cola);
        int valorExtraidodelaCola;
        System.out.println(" Mayor Valor " + MayorValor);
        Numeros aux = new Numeros(10);
        while (!cola.esVacia()) {

            valorExtraidodelaCola = cola.eliminar();
            if (MayorValor != valorExtraidodelaCola) {

                aux.Adicionar(valorExtraidodelaCola);
            }

        }


        cola.Vaciar(aux);
        cola.Adicionar(MayorValor);
        cola.Mostrar();

    }

    public static void ElimininarElementos(Numeros cola  ) {

        Numeros aux = new Numeros(10);

        int elem = cola.eliminar();
        int valorExtraidoDelaPila = 0;


        while (cola.esVacia() == false) {

            valorExtraidoDelaPila = cola.eliminar();
            if (valorExtraidoDelaPila == elem) {


            }

            aux.Adicionar(valorExtraidoDelaPila);


        }

        cola.Vaciar(aux);



        cola.Mostrar();



    }
}






