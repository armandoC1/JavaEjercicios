package JavaExamen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numeros=0;

        System.out.println("Ingrese un numero entero para saber los numeros impares");
        numeros=in.nextInt();
        for (int i = 0; i < numeros ; i++) {
            if ((i%2)!=0) {
                System.out.println("Numeros impares: "+ i);
            }

        }

    }
}
