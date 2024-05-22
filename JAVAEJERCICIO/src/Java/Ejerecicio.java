package Java;

import javax.xml.xpath.XPathFunction;
import java.util.Scanner;

public class Ejerecicio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Persona persona = new Persona();
        Futbolista futbolista = new Futbolista();
        Entrenador entrenador = new Entrenador();
        Masajista masajista = new Masajista();


                System.out.println("HOLA FUTBOLISTA INGRESE LOS SIGUIENTES DATOS: ");
                System.out.println("ID: ");
                futbolista.id=in.nextInt();
                System.out.println("NOMBRE: ");
                futbolista.nombre= in .next();
                System.out.println("APELLIDO: ");
                futbolista.apellido=in.next();
                System.out.println("EDAD: ");
                futbolista.edad=in.nextInt();
                System.out.println("DORSAL: ");
                futbolista.dorsal=in.next();
                System.out.println("DEMARCACION: ");
                futbolista.demararcacion= in.next();

                System.out.println("\n----DATOS DEL FUTBOLISTA----" +
                        "\nID: "+ futbolista.id+
                        "\nNOMBRE: " +futbolista.nombre+
                        "\nAPELLIDO: " +futbolista.apellido+
                        "\nEDAD: " +futbolista.edad+
                        "\nDORSAL: " +futbolista.dorsal+
                        "\nDEMARCACION "+futbolista.demararcacion);
                        futbolista.concentrarse();
                        futbolista.viajar();
                        futbolista.jugarPartido();
                        futbolista.entrenar();

                System.out.println("\nHOLA ENTRENADOR INGRESE LOS SIGUIENTES DATOS: ");
                System.out.println("ID: ");
                entrenador.id=in.nextInt();
                System.out.println("NOMBRE: ");
                entrenador.nombre= in .next();
                System.out.println("APELLIDO: ");
                entrenador.apellido=in.next();
                System.out.println("EDAD: ");
                entrenador.edad=in.nextInt();
                System.out.println("ID FEDERACION: ");
                entrenador.idFederacion= in.next();

                System.out.println("\n---DATOS DEL ENTRENADOR----" +
                        "\nID: "+ entrenador.id+
                        "\nNOMBRE: " +entrenador.nombre+
                        "\nAPELLIDO: " +entrenador.apellido+
                        "\nEDAD: " +entrenador.edad+
                        "\nID FEDERACION: "+entrenador.idFederacion);
        System.out.println();
                entrenador.concentrarse();
                entrenador.viajar();
                entrenador.dirigirEntrenamiento();
                entrenador.dirigirPartido();

                System.out.println("\nHOLA MASAJISTA INGRESE LOS SIGUIENTES DATOS: ");
                System.out.println("ID: ");
                masajista.id=in.nextInt();
                System.out.println("NOMBRE: ");
                masajista.nombre= in .next();
                System.out.println("APELLIDO: ");
                masajista.apellido=in.next();
                System.out.println("EDAD: ");
                masajista.edad=in.nextInt();
                System.out.println("TITULACION: ");
                masajista.titulacion= in.next();
                System.out.println("AÑOS DE EXPERENCIA");
                masajista.anioExperiencia=in.nextInt();

                System.out.println("----DATOS DEL MASAJISTA----" +
                        "\nID: "+ masajista.id+
                        "\nNOMBRE: " +masajista.nombre+
                        "\nAPELLIDO: " +masajista.apellido+
                        "\nEDAD: " +masajista.edad+
                        "\nTITULCION: "+masajista.titulacion+
                        "\nAÑOS DE EXPERIENCIA: "+masajista.anioExperiencia);
        System.out.println();
                        masajista.concentrarse();
                        masajista.darMasaje();
                        masajista.viajar();


    }
}
class Persona{
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(){}

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public  void concentrarse(){
        System.out.println("Metodo de la clase padre, concentrarse");
    }

    public void viajar(){
        System.out.println("Metodo viajar de la clase padre");
    }
}

class Futbolista extends Persona{
    protected String dorsal;
    protected String demararcacion;

    public Futbolista(){}

    public Futbolista(int id, String nombre, String apellido, int edad, String dorsal, String demararcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demararcacion = demararcacion;
    }

    public void  jugarPartido(){
        System.out.println("El jugador juga partidos ");
    }
    public void entrenar(){
        System.out.println("El jugador entrena");
    }
    //polimorfismo

    @Override
    public void concentrarse(){
        System.out.println("El futbolista se concentra junto al equipo");
    }
    @Override
    public void viajar(){
        System.out.println("El futbolista viaja junto al equipo");
    }

}

class Entrenador extends Persona
{
    protected String idFederacion;

    public Entrenador(){}

    public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
        System.out.println("El entrenador dirige partidos");
    }
    public void dirigirEntrenamiento(){
        System.out.println("El entrenador  dirige entrenos");
    }
    //polimorfismo

    @Override
    public void concentrarse(){
        System.out.println("El entreador se concentra junto al equipo");
    }
    @Override
    public void viajar(){
        System.out.println("Soy el entrenador y viajo junto al equipo");
    }

}

class Masajista extends Persona{
    protected String titulacion;
    protected int anioExperiencia;

    public Masajista(){}

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int anioExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anioExperiencia = anioExperiencia;
    }

    public void darMasaje(){
        System.out.println("Soy el masajista y doy masajes");
    }
    //polimorfismo
    @Override
    public void concentrarse(){
        System.out.println("Soy el masajista y me concentro junto al equipo");
    }
    @Override
    public void viajar(){
        System.out.println("Soy el masajista y viajo junto al equipo");
    }

}