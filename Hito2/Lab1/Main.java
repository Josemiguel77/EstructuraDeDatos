package example;

public class Main {

    public static void main (String[] args ) {

        vehiculo v1 = new vehiculo();

        v1.girar_a_la_derecha();
        v1.cambiar_carril();

        vehiculo v2 = new vehiculo(" mquuen" , " azul " , "vagoneta" , "4x4" , "toyota ");
        v2.Mover();

        v2.mostrar_atributos();
        v2.getNombre();
        System.out.println("nombre: " + v2.getNombre());
        v2.setColor("negro");
        v2.mostrar_atributos();


        // crear  un metodo en la clase vehiculo que me muestre todos su atributos

        //crear el metodo cambiar de carril y llamarlo desde la clase main

    }


}


