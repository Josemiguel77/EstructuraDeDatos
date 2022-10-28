package PilaDeCadenas;


import Hito3.Pilanumeros;

public class Main1 {
    public static void main(String[] args) {
        PilaDeCadenas Nombres = new PilaDeCadenas(10);

        Nombres.Adicionar("William");
        Nombres.Adicionar("Andres");
        Nombres.Adicionar("Josias");
        Nombres.Adicionar("Iris");
        Nombres.Adicionar("Jhonatan");
        Nombres.Adicionar("Illiam");
        Nombres.Adicionar("Andres");

        Nombres.Mostrar();

        DeterminaUsuariosPorNombre(Nombres, "Andres");
        AgregarPosicion(Nombres, "Ana");
        NuevaPosicion(Nombres , 3);
    }


    public static void DeterminaUsuariosPorNombre(PilaDeCadenas Nombres, String buscarNombre) {

        PilaDeCadenas aux = new PilaDeCadenas(10);
        int contar = 0;
        String valorExtraidoDelaPila = "";


        while (Nombres.esVacio() == false) {

            valorExtraidoDelaPila = Nombres.eliminar();

            // wn JAVA Cuando se quiera comparar cadenas
            // se usa el equals.()
            if (valorExtraidoDelaPila.equals(buscarNombre)) {

                contar = contar + 1;


            }

            aux.Adicionar(valorExtraidoDelaPila);


        }

        Nombres.Vaciar(aux);

        System.out.println("las personas que se llaman " + buscarNombre + " son: " + contar);


    }


    public static void AgregarPosicion(PilaDeCadenas Nombres, String Nombre) {

        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorExtraidoDelaPila = "";
        while (Nombres.esVacio() == false) {

            valorExtraidoDelaPila = Nombres.eliminar();


            aux.Adicionar(valorExtraidoDelaPila);


        }
        Nombres.Adicionar(Nombre);
        Nombres.Vaciar(aux);
        Nombres.Mostrar();


    }

    public static void NuevaPosicion(PilaDeCadenas Nombres, int kaesimo) {

        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorExtraidoDelaPila = null;
        while (Nombres.esVacio() == false) {

            valorExtraidoDelaPila = Nombres.eliminar();
            if (Nombres.nroElem() == kaesimo) {

                aux.Adicionar(valorExtraidoDelaPila);
            }


        }

        Nombres.Vaciar(aux);
        Nombres.Mostrar();

    }
}