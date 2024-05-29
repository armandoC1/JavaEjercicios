package EvaluacionJAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PedirProducto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Producto> lista = new ArrayList();
        Random ram = new Random();
        int respuesta=0;
        String codigo = " ";
        String dosMarca="";
        String tresNombre="";
        do {
            System.out.println("Ingrese su ID: ");
            int id = in.nextInt();
            System.out.println("Ingrese el nombre: ");
            String nombre = in.next();
            System.out.println("Ingrese la marca: ");
            String marca = in.next();
            System.out.println("Ingrese el precio: ");
            double precio = in.nextDouble();
            System.out.println("Desea continuar " +
                    "\n1. Si" +
                    "\n2. No");
            respuesta = in.nextInt();

            if (nombre.length() >= 3) {
                 tresNombre = nombre.substring(0,3);
            }
            if (marca.length() >=3){
                 dosMarca = marca.substring(0,2);
            }
            int numeroRamdon = ram.nextInt(100, 999);
            codigo = tresNombre+dosMarca+numeroRamdon;

            Producto producto = new Producto(id,nombre,marca,codigo,precio);
            lista.add(producto);
        }
        while (respuesta == 1);

        Iterator it = lista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
