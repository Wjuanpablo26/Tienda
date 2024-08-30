package co.edu.uniquindio.poo.model;

public class Producto {

    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private Tipo tipo;
    /**
     * 
     * @param nombre
     * @param precioCompra
     * @param tipo
     */
    public Producto(String nombre, double precioCompra, Tipo tipo) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.tipo = tipo;
    }


    /*
     * Metodos getters
     */
    public String getNombre() {
        return nombre;
    }

    public double getPrecioCompra(){
        return precioCompra;
    }

    public Tipo getTipo(){
        return tipo;
    }

    /**
     * 
     * @return
     */
    public double calcularPrecioVenta(){
        precioVenta = precioCompra + (precioCompra * tipo.getIncremento());
        return precioVenta;
    }






    
}
