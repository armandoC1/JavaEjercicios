package EvaluacionJAVA;

public class Producto {
    private int id;

    private String nombre;
    private String marca;
    private String codigo;
    private double precio;

    public Producto(){}

    public Producto(int id, String nombre, String marca, String codigo, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        return "\nLISTA DE PRODUCTOS: " +
                "\nID: "+ id+
                "\nCODIGO: " + codigo+
                "\nNOMBRE: "+ nombre+
                "\nMARCA: "+ marca+
                "\nPRECIO: "+ precio;
    }
}
