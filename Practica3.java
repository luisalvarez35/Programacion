package Practica_3;

import java.util.*;

public class Practica3 {

    public static void main(String[] args) {

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////// Declaramos variables y creamos un objeto de la clase Scanner para recoger datos en la consola
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int op_tipo;
        int op_prog;
        Scanner in = new Scanner(System.in);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////// Imprimimos opciones en pantalla y recogemos el dato
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("==============================================================");
        System.out.println("= ¿Sobre que tipo de estructura quieres resolver ejercicios? =");
        System.out.println("== 1.if                                                      =");
        System.out.println("== 2.switch                                                  =");
        System.out.println("==============================================================");

        op_tipo = in.nextInt();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////
        switch (op_tipo){
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// Imprimimos opciones en pantalla y recogemos el dato
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 1:
                System.out.println("==============================================================");
                System.out.println("==============================================================");
                System.out.println("= Introduce el numero del ejercicio que quieres que resuelva =");
                System.out.println("== 1.Par o impar                                             =");
                System.out.println("== 2.Sueldo anual(impuestos)                                 =");
                System.out.println("== 5.Triangulo valido                                        =");
                System.out.println("== 6.Fiesta de marmotas                                      =");
                System.out.println("== 7.Notas                                                   =");
                System.out.println("==============================================================");
                System.out.println("==============================================================");

                op_prog = in.nextInt();
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                /////// Lamamos al metodo del ejercicio que se seleccionado
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                switch (op_prog) {

                    case 1:ej1if();
                        break;
                    case 2:ej2if();
                        break;
                    case 5:ej5if();
                        break;
                    case 6:ej6if();
                        break;
                    case 7:ej7if();
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }

                break;
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// Imprimimos opciones en pantalla y recogemos el dato
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case 2:
                System.out.println("==============================================================");
                System.out.println("==============================================================");
                System.out.println("= Introduce el numero del ejercicio que quieres que resuelva =");
                System.out.println("== 2.Sistema operativo                                       =");
                System.out.println("== 3.Cadena de texto                                         =");
                System.out.println("== 4.Harry Potter                                            =");
                System.out.println("== 5.Numero de direccion                                     =");
                System.out.println("==============================================================");
                System.out.println("==============================================================");

                op_prog = in.nextInt();

                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                /////// Lamamos al metodo del ejercicio que se seleccionado
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                switch (op_prog) {

                    case 2:ej2switch();
                        break;
                    case 3:ej3switch();
                        break;
                    case 4:ej4switch();
                        break;
                    case 5:ej5switch();
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

    }




    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////// Creamos los metodos de los ejercicios
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void ej1if() {

        int num;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce un numero:");

        num = in.nextInt();

        ////////////////////////////////////////////////////////////

        if ((num % 2) == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej2if() {

        int sueldo;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el sueldo:");

        sueldo = in.nextInt();

        ///////////////////////////////////////////////////////

        if (sueldo < 9000) {
            System.out.println("No abonoar impuestos");
        } else {
            System.out.println("Abonar impuestos");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej5if(){

        int A;
        int B;
        int C;
        ////////////////////////////////////////////////////////////////////
        Scanner in = new Scanner(System.in);
        //////////////////////////////////////////////////
        System.out.print("Introduce lado A:");
        A = in.nextInt();
        System.out.print("Introduce lado B:");
        B = in.nextInt();
        System.out.print("Introduce lado C:");
        C = in.nextInt();

        ///////////////////////////////////////////////////////////////////////

        if(( (A + B) > C ) || ( (A + C) > B ) || ( (B + C) > A)){
            System.out.print("El triangulo existe");
        } else{
            System.out.println("El triangulo no existe");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej6if(){

        int tazas;
        boolean semana;

        ///////////////////////////////////////////////////////////////
        Scanner in = new Scanner(System.in);
        //////////////////////////////////////////////////
        System.out.print("Introduce el numero de tazas de mantequilla de cacahuete:");
        tazas = in.nextInt();
        System.out.print("Es fin de semana? true/ false");
        semana = in.nextBoolean();
        ///////////////////////////////////////////////////////////////

        if( ( (tazas >= 10) && (tazas <= 20) && ( semana == false) ) ){
            System.out.print("La fiesta es un exito");

        }else if( ( (tazas >= 15) && (tazas <= 25) && ( semana == true) ) ){
            System.out.print("La fiesta es un exito");

        }else {
            System.out.println("La fiesta no es un exito");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej7if() {

        float nota;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce la nota numerica (0 y 10):");

        nota = in.nextFloat();

        ///////////////////////////////////////////////////////////////////
        if ((nota >= 0) && (nota < 3)) {
            System.out.print("La nota es: MD");
        } else if ((nota >= 3) && (nota < 5)) {
            System.out.print("La nota es: INS");
        }else if ((nota >= 5) && (nota < 6)) {
            System.out.print("La nota es: SUF");
        }else if ((nota >= 6) && (nota < 7)) {
            System.out.print("La nota es: B");
        }else if ((nota >= 7) && (nota < 9)) {
            System.out.print("La nota es: N");
        }else if ((nota >= 9) && (nota < 10)) {
            System.out.print("La nota es: SB");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej2switch() {

        int num;
        Scanner in = new Scanner(System.in);

        /////////////////////////////////////////////////////////////////////////////
        System.out.println("Que lenguaje de programacion esta estudiando?");
        System.out.println("1.Java 2.Kotlin 3.Scala 4.Python");

        num = in.nextInt();

        //////////////////////////////////////////////////////////////////////////////

        switch (num) {
            case 1:
                System.out.println("Si!");
                break;
            case 2:
                System.out.println("No!");
                break;
            case 3:
                System.out.println("No!");
                break;
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Numero desconocido");

        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej3switch(){

        String num;

        Scanner in = new Scanner(System.in);

        System.out.print("Introduce el numero escrito:");

        num = in.nextLine();

        ////////////////////////////////////////////////////////////////////////

        switch (num) {
            case "uno":
                System.out.println("1");
                break;
            case "dos":
                System.out.println("2");
                break;
            case "tres":
                System.out.println("3");
                break;
            case "cuatro":
                System.out.println("4");
                break;
            case "cinco":
                System.out.println("5");
                break;
            case "seis":
                System.out.println("6");
                break;
            case "siete":
                System.out.println("7");
                break;
            case "ocho":
                System.out.println("8");
                break;
            case "nueve":
                System.out.println("9");
                break;
            default:
                System.out.println("Numero desconocido");

        }

    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej4switch(){

        int num;
        Scanner in = new Scanner(System.in);

        /////////////////////////////////////////////////////////////////////////////
        System.out.println("Introducir numero de la casa:");
        System.out.println("1.gryffindor 2.hufflepuff 3.slytherin 4.ravenclaw");

        num = in.nextInt();

        //////////////////////////////////////////////////////////////////////////////

        switch (num) {
            case 1:
                System.out.println("valentía");
                break;
            case 2:
                System.out.println("lealtad!");
                break;
            case 3:
                System.out.println("astucia");
                break;
            case 4:
                System.out.println("intelecto");
                break;
            default:
                System.out.println("No es una casa válida");

        }

    }
    ///////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    public static void ej5switch(){

        int num;
        Scanner in = new Scanner(System.in);

        /////////////////////////////////////////////////////////////////////////////
        System.out.println("Introducir numero de direccion:");
        System.out.println("1-arriba, 2-abajo, 3-izquierda, 4-derecha, 0–no mover");

        num = in.nextInt();

        //////////////////////////////////////////////////////////////////////////////

        switch (num) {
            case 1:
                System.out.println("bajar");
                break;
            case 2:
                System.out.println("mover a la izquierda");
                break;
            case 3:
                System.out.println("mover a la derecha");
                break;
            case 4:
                System.out.println("no mover");
                break;
            default:
                System.out.println("¡error!");

        }
    }


}


