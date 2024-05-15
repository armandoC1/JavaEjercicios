package JavaExamen;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int contador =8;
        String elementos[] = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese ["+(contador-i)+"]" +" elementos");
            elementos[i]=in.next();

        }
        for (int i = 7; i >=0; i--) {
            System.out.println("Elementos: "+(elementos[i]));
        }
    }
}
