import java.util.Scanner;

public class sumadosnumero {

    public static void main(String args []){
        System.out.println( "program que suma numbers ");

        int num1 , num2 , result1 , result2 , result3 , result4 ;
        Scanner read = new Scanner (System.in);

        System.out.println( "ingrese el valor de num1  ");
        num1 = read.nextInt();

        System.out.println( "ingrese el valor de num2 ");
        num2 = read.nextInt();

        result1 = num1 + num2;
        result2 = num1 - num2;
        result3 = num1 * num2;
        result4 = num1 / num2;



        System.out.println( " la suma es: " + result1);
        System.out.println( " la resta es: " + result2);
        System.out.println( " la multipicacion es: " + result3);
        System.out.println( " la division es: " + result4);


    }













}
