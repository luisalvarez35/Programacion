import java.util.*;

public class Practica2 {

    public static void main(String[] args) {

        //////////////////////////////////////////////////////////////////////////////////
        int num1;                                                   //Declaramos variable numero 1.
        int num2;                                                   //Declaramos variable numero 2.
        String oper;                                                //Declaramos objeto clase String.

        //////////////////////////////////////////////////////////////////////////////////
        Scanner in = new Scanner(System.in);                        //Creamos objeto clase Scanner.

        System.out.print("Introduzca primer numero:");
        num1 = in.nextInt();                                         //Pedimos primer numero.

        System.out.print("Introduzca segundo numero:");
        num2 = in.nextInt();                                        //Pedimos segundo numero.

        System.out.print("Introduzca operador:");
        oper = in.next();                                           //Pedimos operador.

        //////////////////////////////////////////////////////////////////////////////////////
        if((num1<0) || (num2<0)){                                   //Comprobamos que los numeros no sean negativos.
            System.out.print("Los numeros no pueden ser negativos");
        }
        else {

            switch (oper) {                                         //Realizamos operaciones dependiendo del operador.

                case "+":
                    System.out.print("Resultado:" + (num1 + num2));

                    break;
                case "-":
                    System.out.print("Resultado:" + (num1 - num2));

                    break;
                case "*":
                    System.out.print("Resultado:" + (num1 * num2));

                    break;
                case "/":
                    System.out.print("Resultado:" + (num1 / num2));

                    break;
            default:                                                // Si el operador no es ninguno de los permitidos
                System.out.print("Operador Incorrecto");            // se termina el programa.

                            }
            }
        ///////////////////////////////////////////////////////////////////////////////////
    }

}
