import java.util.Scanner;

import operacionesalgebraicas.operaciones;

public class operacionesmain {

    public static void main(String args []) {
        System.out.println("program que suma 2 numeros usando clases ");

        int num1, num2;
        Scanner read = new Scanner(System.in);

        System.out.println("ingrese el valor de num1  ");
        num1 = read.nextInt();

        System.out.println("ingrese el valor de num2 ");
        num2 = read.nextInt();

        operaciones oper1 = new operaciones(num1 , num2);

        int suma = oper1.suma();
        System.out.println(" la suma es: " +suma);
    }



    }
