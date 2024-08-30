package co.edu.uniquindio.poo.application;

import co.edu.uniquindio.poo.model.Producto;
import co.edu.uniquindio.poo.model.Tienda;
import co.edu.uniquindio.poo.model.Tipo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Producto[] productos = new Producto[3];
        productos[0] = new Producto("Arroz", 5000, Tipo.NOPERECEDERERO);
        productos[1] = new Producto("Leche", 3000, Tipo.REFRIGERADO);
        productos[2] = new Producto("Carne", 10000, Tipo.PERECEDERO);

        Tienda tienda = new Tienda("Tienda de la esquina", productos);

        System.out.println("Nombre de la tienda: " + tienda.getNombre());
        System.out.println("Productos de la tienda: ");
        for (Producto producto : tienda.getProductos()) {
            System.out.println("El nombre del Producto es: "+producto.getNombre() + " Y el precio de venta es: "+producto.calcularPrecioVenta());
        }

        Producto producto = new Producto("Pescado", 15000, Tipo.PERECEDERO);
        tienda.agregarProducto(producto);
        System.out.println("Productos de la tienda despues de agregar un producto: ");
        for (Producto productoAux : tienda.getProductos()) {
            System.out.println("El nombre del Producto es: "+productoAux.getNombre()+ " Y el precio de venta es: "+productoAux.calcularPrecioVenta());
        }

        tienda.eliminarProducto("Leche");
        System.out.println("Productos de la tienda despues de eliminar un producto: ");
        for (Producto productoAux : tienda.getProductos()) {
            System.out.println("El nombre del Producto Es: "+productoAux.getNombre()+" Y el precio de venta es: "+productoAux.calcularPrecioVenta());
        }

        Producto productoBuscado = tienda.buscarProducto("Arroz");
        System.out.println("El nombre del Producto buscado es: " + productoBuscado.getNombre());
        
    }
}



