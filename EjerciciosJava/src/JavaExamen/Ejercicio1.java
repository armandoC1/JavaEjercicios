package JavaExamen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int partidos =0;

        System.out.println("Cuantos partidos a jugado en la temporada?");
        partidos= in.nextInt();



        System.out.println("De los " + partidos+ " cuantos ganos?");
        int ganados = in.nextInt();
        System.out.println("De los " + partidos+ " cuantos empato?");
        int empatados = in.nextInt();
        System.out.println("De los " + partidos+ " cuantos perdio?");
        int perdidos = in.nextInt();

        if ((perdidos+empatados+ganados) == partidos) {
            int ganadosSuma = ganados*3;
            int empatadosSuma = empatados*1;
            int perdidosSuma = perdidos*0;
            int mostrar = ganadosSuma+empatadosSuma+perdidosSuma;
            System.out.println("Usted jugo un total de "+partidos+" partidos con los siguientes resultaos\n" +
                    "\nPARTIDOS GANADOS: "+ ganados +" PUNTOS OBTENIDOS: "+ganadosSuma+
                    "\nPARTIDOS EMPATADOS: "+empatados+ " PUNTOS OBTENIDOS "+ empatadosSuma+
                    "\nPARTIDOS PERDIDOS: "+ perdidos + " PUNTOS OBTENIDOS: "+ perdidosSuma+"\n"+
                    "\nTOTAL DE PUNTOS EN LA TEMPORADA: "+ mostrar);
        }else
            System.out.println("A ingresado mayor cantidad de datos de los partidos jugados" +
                    "\nDebe ingresar un total de: "+ partidos+ " e ingreso :"+ (perdidos+empatados+ganados));

    }
}
