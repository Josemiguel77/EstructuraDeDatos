package example;

public class vehiculo {

    // atributos de la clase

     private String nombre;
     private String color;
     private String modelo;
     private String tamaño;
     private String marca;

     // contructor de la clase vehiculo
     public vehiculo(){

         System.out.println( " Soy el constructor ");

     }

     public vehiculo(String nombre , String color , String  modelo , String tamaño , String marca ){

          this.nombre = nombre;
          this.color = color;
          this.modelo = modelo;
          this.tamaño = tamaño;
          this.marca = marca;



     }

     public void  Mover(){

          System.out.println( " Soy el metodo mover ");
     }

     public void  Frenar (){

          System.out.println( " Soy el metodo frenar ");
     }

     public void  girar_a_la_derecha(){

          System.out.println( " Soy el metodo girar_a_la_derecha ");
     }

     public void  girar_a_la_izquierda(){

          System.out.println( " Soy el metodo girar_a_la_izquierda ");
     }

     public void  cambiar_carril(){

          System.out.println( " Soy el metodo de cambio de carril ");
     }

     public void  mostrar_atributos(){

          System.out.println( " el nombre es "+ nombre);
          System.out.println( " el color es "+ color);
          System.out.println( " el modelo es "+ modelo);
          System.out.println( " el tamaño es "+ tamaño);
          System.out.println( " la marca es "+ marca);

     }

     //retornar
     public String getNombre(){

          return nombre;
     }

     public void setColor(String nuevocolor ){

          this.color = nuevocolor;
     }




}
