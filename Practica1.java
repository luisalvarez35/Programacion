package Practica1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int HoraIni;
        int MinutosIni;
        int SegundosIni;
        int MomentoIni;

        int HoraFin;
        int MinutosFin;
        int SegundosFin;
        int MomentoFin;

       //////////////////////////////////////////////////////////////////////////////////////////////////////

        do  {
            System.out.println("Momento Inicial:");
            System.out.println("                ");

            do {
                System.out.print("Introduce Hora Inicial:");
                HoraIni = in.nextInt();
                if (HoraIni>23 || HoraIni<0)
                    System.out.println("La Hora debe estar entre 0 y 23");
            } while (HoraIni>23 || HoraIni<0);

            do {
                System.out.print("Introduce Minuto Inicial:");
                MinutosIni = in.nextInt();
                if (MinutosIni>59 || MinutosIni<0)
                    System.out.println("Los Minutos debe estar entre 0 y 59");
            } while (MinutosIni>59 || MinutosIni<0);

            do {
                System.out.print("Introduce Segundos Inicial:");
                SegundosIni = in.nextInt();
                if (SegundosIni>59 || SegundosIni<0)
                    System.out.println("Los Segundos deben estar entre 0 y 59");
            } while (SegundosIni>59 || SegundosIni<0);
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            System.out.println("Momento Final:");
            System.out.println("              ");

            do {
                System.out.print("Introduce Hora Final:");
                HoraFin = in.nextInt();
                if (HoraFin>23 || HoraFin<0)
                    System.out.println("La Hora debe estar entre 0 y 23");
            } while (HoraFin>23 || HoraFin<0);

            do {
                System.out.print("Introduce Minuto Final:");
                MinutosFin = in.nextInt();
                if (MinutosFin>59 || MinutosFin<0)
                    System.out.println("Los Minutos debe estar entre 0 y 59");
            } while (MinutosFin>59 || MinutosFin<0);

            do {
                System.out.print("Introduce Segundos Final:");
                SegundosFin = in.nextInt();
                if (SegundosFin>59 || SegundosFin<0)
                    System.out.println("Los Segundos deben estar entre 0 y 59");
            } while (SegundosFin>59 || SegundosFin<0);
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            /////////////////////////////////////////////////////////////////////////////////////////////////////////

            System.out.println(" ");
            System.out.println("Datos Introducidos: Momento Inicial: " + HoraIni + ":" + MinutosIni + ":" + SegundosIni + "   Momento Final: " +
                    HoraFin + ":" + MinutosFin + ":" + SegundosFin);
            System.out.println(" ");
            //////////////////////////////////////////////////////////////////////////////////////////////////////

            /////////////////////////////////////////////////////////////////////////////////////////////////////////


            MomentoIni = HoraIni*3600+MinutosIni*60+SegundosIni;
            MomentoFin = HoraFin*3600+MinutosFin*60+SegundosFin ;
            if ( MomentoIni <= MomentoFin )
            {
                int DifSegundos = MomentoFin-MomentoIni;

                int DifHoras    = DifSegundos/3600;
                int DifMinutos  = (DifSegundos-DifHoras*3600)/60;
                DifSegundos     = DifSegundos - (DifHoras*3600+DifMinutos*60);
                System.out.println("La diferencia entre ambos momentos es: "
                        + DifHoras + ":" + DifMinutos + ":" + DifSegundos );
                System.out.println(" ");
            }
            else
                System.out.println("El Momento Inicial debe ser Menor o Igual que el Momento Final.");

        }while ( MomentoIni > MomentoFin );
    }
}
