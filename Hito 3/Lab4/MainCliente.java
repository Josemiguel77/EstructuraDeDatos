package PilaDeClientes;


import PilaDeLibros.PilaDeLibros;

public class MainCliente {

    public static void main(String[] args) {

        Cliente Cli1 = new Cliente(" Jose ", " Oblitas ", 22, "Ceja calle 1 ", " Masculino ");
        Cliente Cli2 = new Cliente(" Miguel ", " Choque ", 21, "Ceja calle 2 ", " Masculino ");
        Cliente Cli3 = new Cliente(" Victor ", " Quispe ", 20, "Ceja calle 3 ", " Masculino ");
        Cliente Cli4 = new Cliente(" Angela ", " Mamani ", 19, "Ceja calle 4 ", " Femenino ");
        Cliente Cli5 = new Cliente(" Jima ", " Mayta ", 18, "Ceja calle 5 ", " Femenino ");

        PilaCliente Pcliente = new PilaCliente(10);

        Pcliente.Adicionar(Cli1);
        Pcliente.Adicionar(Cli2);
        Pcliente.Adicionar(Cli3);
        Pcliente.Adicionar(Cli4);
        Pcliente.Adicionar(Cli5);

        Pcliente.Mostrar();

        // moyoresCiertaEdad(Pcliente , 20);
        // kEsimoPosicion(Pcliente , 3);
        //asignaDireccion(Pcliente , " Femenino " , " Avenida 6 de marzo ");
        reordenarPila(Pcliente);


    }

    public static void moyoresCiertaEdad(PilaCliente clientes, int edadMayor) {
        PilaCliente aux = new PilaCliente(10);
        int Cont = 0;
        Cliente clienteEliminado = null;

        while (clientes.esVacio() == false) {

            clienteEliminado = clientes.eliminar();
            if (clienteEliminado.getEdad() > edadMayor) {

                Cont = Cont + 1;
            }

            aux.Adicionar(clienteEliminado);


        }

        clientes.Vaciar(aux);

        System.out.println("la cantidad de clientes mayores a 20 años son: " + Cont);

    }

    public static void kEsimoPosicion(PilaCliente pila, int valorTope) {
        PilaCliente aux = new PilaCliente(10);
        Cliente valorextraido = null;
        while (pila.esVacio() == false) {
            if (pila.nroElem() != valorTope) {
                aux.Adicionar(pila.eliminar());
            } else {
                valorextraido = pila.eliminar();
            }

        }
        pila.Vaciar(aux);
        pila.Adicionar(valorextraido);
        pila.Mostrar();
    }

    public static void asignaDireccion(PilaCliente pila,  String generos ,String NuevaDireccion ) {

        PilaCliente aux = new PilaCliente(10);

        Cliente pilaextraida = null;

        while (pila.esVacio() == false) {

            pilaextraida = pila.eliminar();

            if (pilaextraida.getGenero().equals(generos))
            {
                if(pila.nroElem() == 4)
                {

                    pilaextraida.setDireccion(NuevaDireccion);
                }

                aux.Adicionar(pilaextraida);
            }

        }
        pila.Vaciar(aux);
        pila.Mostrar();
    }

    public static void reordenarPila(PilaCliente pila)
    {
        PilaCliente aux = new PilaCliente(10);

        Cliente ultimoclieliminado = pila.eliminar();
        Cliente clieliminado = null;
        Cliente primerclieliminado = null;
        Cliente segundo = null;
        Cliente Tercero = null;

        while (pila.esVacio() == false) {

            clieliminado = pila.eliminar();
            aux.Adicionar(clieliminado);
        }
        primerclieliminado = aux.eliminar();
        segundo = aux.eliminar();
        Tercero = aux.eliminar();
        pila.Adicionar(ultimoclieliminado);
        pila.Vaciar(aux);
        pila.Adicionar(primerclieliminado);
        pila.Adicionar(segundo);
        pila.Adicionar(Tercero);

        pila.Mostrar();

    }

}











