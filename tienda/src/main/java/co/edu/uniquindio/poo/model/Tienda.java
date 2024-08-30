package co.edu.uniquindio.poo.model;

public class Tienda {

    private String nombre;
    private Producto[] productos;

    /**
     * Constructor de la clase Tienda
     * @param nombre
     * @param productos
     */
    public Tienda(String nombre, Producto[] productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    /**
     * Metodo get
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    /*
     * Metodo para agregar un producto a la tienda
     */
    public void agregarProducto(Producto producto){
        String mensaje="";
        Producto[] productosAux = new Producto[productos.length + 1];
        for (int i = 0; i < productos.length; i++) {
            productosAux[i] = productos[i];
        }
        productosAux[productos.length] = producto;
        productos = productosAux;
        mensaje="Producto agregado correctamente";
    }

    /*
     * Metodo para eliminar un producto de la tienda
     */
    public void eliminarProducto(String nombre){
        String mensaje="";
        Producto[] productosAux = new Producto[productos.length - 1];
        int j = 0;
        for (int i = 0; i < productos.length; i++) {
            if (!productos[i].getNombre().equals(nombre)) {
                productosAux[j] = productos[i];
                j++;
            }
        }
        productos = productosAux;
        mensaje="Producto eliminado correctamente";
    }

    /*
     * Metodo para buscar un producto en la tienda
     */
    public Producto buscarProducto(String nombre){
        Producto productoEncontrado = null;
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                productoEncontrado = producto;
                break;
            }
        }
        return productoEncontrado;
    }


    /*
     * Metodo para actualizar un producto de la tienda
     */
    public String actualizarProducto(String nombre){

        String mensaje = "Producto no encontrado";
        Producto ProductoEncontrado = buscarProducto(nombre);
        if(ProductoEncontrado != null){
        
            mensaje = "Producto actualizado exitosamente";
        }
        return mensaje;
    }

    /**
     * Metodo para calcular el precio total de los productos
     * @return
     */
    public double calcularPrecioTotal(){
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.calcularPrecioVenta();
        }
        return precioTotal;
    }


    
}
