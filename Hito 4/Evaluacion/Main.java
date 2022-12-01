package Defensa_Colas_Hito4;

public class Main {

    public static void main(String[] args) {

        Cliente Cli1 = new Cliente(" Jose " , " Oblitas " , 23 ," Bolivia " , " Masculino " , " Silver ");
        Cliente Cli2 = new Cliente(" Miguel " , " Sanchez " , 22 ," Bolivia " , " Masculino " , " Silver ");
        Cliente Cli3 = new Cliente(" Valeria " , " Carpio " , 21 ," Argentina " , " Femenino " , " Gold ");
        Cliente Cli4 = new Cliente(" Amalia " , " Angeles " , 20 ," Brazil " , " Femenino " , " VIP ");
        Cliente Cli5 = new Cliente(" Victor " , " Quispe " , 61 ," Bolivia " , " Masculino " , " Gold ");



        Cola_de_Clientes Cola = new Cola_de_Clientes(10);

        Cola.Adicionar(Cli1);
        Cola.Adicionar(Cli2);
        Cola.Adicionar(Cli3);
        Cola.Adicionar(Cli4);
        Cola.Adicionar(Cli5);

       //Cola.Mostrar();
        //cambiarTipo(Cola , " Gold " , " Bolivia " , " VIP");
        DeterminarMayor(Cola , 60 );

    }

    public static void cambiarTipo(Cola_de_Clientes cola, String ntipo , String nPais , String nuevotipo) {
        Cola_de_Clientes aux = new Cola_de_Clientes(10);
        Cola_de_Clientes mostrar = new Cola_de_Clientes(10);
        Cliente clienteEliminado = null;

        while (cola.esVacia() == false) {

            clienteEliminado = cola.eliminar();

            if (clienteEliminado.getPais().equals(nPais)) {

                if (clienteEliminado.getTipo().equals(ntipo)) {
                    clienteEliminado.setTipo(nuevotipo);

                }
            }
            aux.Adicionar(clienteEliminado);
        }
        cola.Vaciar(aux);
        cola.Mostrar();
    }
    public static void DeterminarMayor(Cola_de_Clientes cola, int edadd) {

        Cola_de_Clientes aux = new Cola_de_Clientes(10);
        Cola_de_Clientes aux2 = new Cola_de_Clientes(10);
        int Cont = 0;
        Cliente clienteEliminado = null;

        while (cola.esVacia() == false) {

            clienteEliminado = cola.eliminar();
            if (clienteEliminado.getEdad() > edadd) {

                aux.Adicionar(clienteEliminado);
            }
            else{

                aux2.Adicionar(clienteEliminado);
            }
        }

        cola.Vaciar(aux);
        cola.Vaciar(aux2);
        cola.Mostrar();
    }

}


















