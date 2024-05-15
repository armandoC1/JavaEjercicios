package JavaExamen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        double sueldo=0, descuento=0,resta=0;

        System.out.println("Ingrese su sueldo mensual: ");
        sueldo = in.nextDouble();

        if (sueldo < 500) {
            System.out.println("Usted no aplicada para descuento de la renta");
        }else if(sueldo>=500 && sueldo<750){
            descuento= sueldo*0.05;
            resta = sueldo-descuento;
            String formato = df.format(resta);
            System.out.println("SU SUELDO SUBTOTAL ES DE: "+ sueldo+
            "\nEL DESCUENTO APLICABLE ES DEL 5%: "+ descuento+
                    "\nSUELDO TOTAL: "+ formato);

        } else if (sueldo>=750) {
            descuento= sueldo*0.10;
            resta = sueldo-descuento;
            String formato = df.format(resta);
            System.out.println("SU SUELDO SUBTOTAL ES DE: "+ sueldo+
                    "\nEL DESCUENTO APLICABLE ES DEL 10%: "+ descuento+
                    "\nSUELDO TOTAL: "+ formato);
        }

    }
}
