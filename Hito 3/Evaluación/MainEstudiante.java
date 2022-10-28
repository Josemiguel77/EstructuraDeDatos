package defensa_pilas_hito3;



public class MainEstudiante {

    public static void main(String[] args) {

        Estudiante Estu1 = new Estudiante(" Jose ", " Oblitas ", 22, " la Paz ", 78, " 12345LP ");
        Estudiante Estu2 = new Estudiante(" Miguel ", " Choque ", 18, " El alto ", 80, " 12356OR ");
        Estudiante Estu3 = new Estudiante(" Victor ", " Quispe ", 16, " El alto ", 90, " 13445LP ");
        Estudiante Estu4 = new Estudiante(" Manuel ", " Ortega ", 23, " La paz ", 60, " 12566CB ");
        Estudiante Estu5 = new Estudiante(" Jim ", " Mayta ", 20, " El alto ", 57, " 126565SC ");

        PilaDeEstudiantes PilaEst = new PilaDeEstudiantes(10);

        PilaEst.Adicionar(Estu1);
        PilaEst.Adicionar(Estu2);
        PilaEst.Adicionar(Estu3);
        PilaEst.Adicionar(Estu4);
        PilaEst.Adicionar(Estu5);




        AprobadosElalto(PilaEst, " El alto ");
        NuevaPosicion(PilaEst, 2);
        mostrarAprobados(PilaEst , " El alto ");


    }

    public static void AprobadosElalto(PilaDeEstudiantes PilaEst, String nombresede) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        int Cont = 0;
        Estudiante estudiantesEliminado = null;


        while (PilaEst.esVacio() == false) {

            estudiantesEliminado = PilaEst.eliminar();

            if (estudiantesEliminado.getNotaFinal() > 50) {

                if (estudiantesEliminado.getSede().equals(nombresede)) {

                    Cont = Cont + 1;
                }
            }


            aux.Adicionar(estudiantesEliminado);


        }

        PilaEst.Vaciar(aux);

        System.out.println("la cantidad de estdiantes aprobados son : " + Cont);

    }

    public static void NuevaPosicion(PilaDeEstudiantes estudiantes, int kaesimo) {

        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        Estudiante valorExtraidoDelaPila = null;
        while (estudiantes.esVacio() == false) {

            if (estudiantes.nroElem() != kaesimo) {

                aux.Adicionar(estudiantes.eliminar());
            } else {
                valorExtraidoDelaPila = estudiantes.eliminar();
            }

        }
            estudiantes.Vaciar(aux);
            estudiantes.Adicionar(valorExtraidoDelaPila);
            estudiantes.Mostrar();



    }


    public static void mostrarAprobados(PilaDeEstudiantes PilaEst, String nombresede) {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        PilaDeEstudiantes mostrar = new PilaDeEstudiantes(10);
        Estudiante estudiantesEliminado = null;



        while (PilaEst.esVacio() == false) {

            estudiantesEliminado = PilaEst.eliminar();

            if (estudiantesEliminado.getNotaFinal() > 50) {

                if (estudiantesEliminado.getSede().equals(nombresede)) {

                    mostrar.Adicionar(estudiantesEliminado);
                }
            }


            aux.Adicionar(estudiantesEliminado);


        }

        PilaEst.Vaciar(aux);
        mostrar.Mostrar();

    }






}



