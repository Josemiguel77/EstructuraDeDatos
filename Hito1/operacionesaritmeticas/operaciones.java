package operacionesalgebraicas;

public class operaciones {

    private int num1 , num2 ;

    public operaciones (int num1 , int num2){

        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma(){
        int respuesta = this.num1 + this.num2;
        return respuesta;
    }
    public int resta(){
        int respuesta = this.num1 - this.num2;
        return respuesta;
    }
    public int multiplicacion(){
        int respuesta = this.num1 * this.num2;
        return respuesta;
    }
    public int division(){
        int respuesta = this.num1 / this.num2;
        return respuesta;
    }
}
