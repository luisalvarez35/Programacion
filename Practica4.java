import java.util.Scanner;

public class Practica4 {

    public static void main (String[] args){
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////// Declaramos variables y creamos un objeto de la clase Scanner para recoger datos en la consola
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int op_tipo;
        Scanner in = new Scanner(System.in);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////// Imprimimos opciones en pantalla y recogemos el dato
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        do {

        System.out.println("=====================================");
        System.out.println("= Introduce el ejercicio a resolver =");
        System.out.println("== 1.For                            =");
        System.out.println("== 2.While                          =");
        System.out.println("=====================================");

        op_tipo = in.nextInt();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////// Llamamos a un metodo dependiendo de la opcion elegida
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            switch (op_tipo) {
                case 1:
                    Ej_for();
                    break;

                case 2:
                    Ej_do_while();
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
                            }
        }while ( (op_tipo <= 1) || (op_tipo >= 2) );//Ya que la practica no especifica que el programa deba terminar
                                                    // al acabar el programa volvera a comenzar
    }

///////////////////// Metodo ejercicio for //////////////////////////////
    public static void Ej_for(){

        int alto;
        int ancho;
        String caracter;
        Scanner in = new Scanner(System.in);

        System.out.print("Inatroduzca alto:");
        alto = in.nextInt();
        System.out.print("Inatroduzca ancho:");
        ancho = in.nextInt();
        System.out.print("Inatroduzca String:");
        caracter = in.next();

        for (int x=1;x<=alto;x++){

            for (int b=1;b<=ancho;b++){
                System.out.print(caracter + "\t");
            }
            System.out.println();
        }

    }

///////////////////// Metodo ejercicio do-while //////////////////////////
    public static void Ej_do_while() {

        Scanner in = new Scanner(System.in);
        int num;
        int numAl = (int) (Math.random() * 100 + 1);


        System.out.println("Vamos a encontrar un nuevo elegido al azar entre 1 y 100.");
        System.out.println("Si en algun momento deseas rendirte, teclea 0.");

        do {
            System.out.print("Introduce un numero: ");
            num = in.nextInt();

            if (num == 0) {
                System.out.println("Te has rendido, el numero era: " + numAl);
            } else {

                if (num == numAl) {
                    System.out.println("Felicidades, has encontradop el numero.");
                } else if (num < numAl) {
                    System.out.println("El numero a encontrar es mayor.");
                } else {
                    System.out.println("El numero a encontrar es menor.");
                }
            }
        }while( num != 0);
    }
}
